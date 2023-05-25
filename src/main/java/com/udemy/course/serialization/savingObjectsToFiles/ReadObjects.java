package com.udemy.course.serialization.savingObjectsToFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

    public static void main(String[] args) {

        System.out.println("Read Objects ...");

        try(FileInputStream fi = new FileInputStream("people.bin")) {

            ObjectInputStream oi = new ObjectInputStream(fi);

            //as it returns Object class(which is grandparent), so we need to cast to particular object
            Person person1 = (Person)oi.readObject();
            Person person2 = (Person)oi.readObject();

            oi.close();

            System.out.println(person1);
            System.out.println(person2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
