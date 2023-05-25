package com.udemy.course.serializingArrays;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

    public static void main(String[] args) {

        System.out.println("Write Objects ...");

        Person[] people = {new Person(1, "Mike"), new Person(99, "Sue"), new Person(7, "Bob")};

        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));

        try (FileOutputStream fs = new FileOutputStream("array.bin")) {

            ObjectOutputStream os = new ObjectOutputStream(fs);

            //NOTSERIAZABLEEXECTION
            //INTERVIEW QUESTION: How do we make class serializable in java?
            //All we need to do, is to implement Serializable interface
            os.writeObject(people);

            os.writeObject(peopleList);

            ///the way to serialize with number of obj
            os.writeInt(peopleList.size());

            for (Person person : peopleList) {
                os.writeObject(person);
            }
            ///

            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
