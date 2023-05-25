package com.udemy.course.creatingAndWritingTextFiles;

import java.io.*;

public class App {

    public static void main(String[] args) {

        File file = new File("new_created_text.txt");

        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))){

            br.write("First line!!");
            br.newLine();
            br.write("Second line!!");
            br.newLine();
            br.write("Third line!!");

        } catch (IOException e) {
            System.out.println("Unable to read file " + file.toString());
        }

    }

}
