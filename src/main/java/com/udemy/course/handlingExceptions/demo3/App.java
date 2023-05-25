package com.udemy.course.handlingExceptions.demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
    public static void main(String[] args) {

         try {
             openFile();
         }catch (FileNotFoundException e){
             System.out.println("Could not open file");
         }

/*

        try {
            openFile1();
        }catch (FileNotFoundException e){
            System.out.println("Could not open file");
        }
*/

    }

    public static void openFile() throws FileNotFoundException{

        File file = new File("test.txt");

        FileReader fr = new FileReader(file);

    }

    public static void openFile1(){

        try {
            openFile();
        }catch (FileNotFoundException e){
            System.out.println("Could not open file");
        }

    }

}
/*

class NotApp extends App{
    @Override
    public void openFile() throws FileNotFoundException {
        super.openFile();
    }

    @Override
    public void openFile1() {
        super.openFile1();
    }
}
*/
