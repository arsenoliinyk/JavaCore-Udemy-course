package com.udemy.course.handlingExceptions.multipleExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class App {
    public static void main (String[] args){

        Test test = new Test();

/*
        try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
*/

/*
        try {
            test.run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
*/


        try {
            test.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            test.input();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }


    }




}
