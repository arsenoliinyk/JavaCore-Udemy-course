package com.udemy.course.handlingExceptions.runtimeExceptions;


public class App {
    public static void main(String[] args) {
/*
////Runtime exception(unchecked)////////////////////////
        int value = 7;

        value = value/7;
*/
/*

        String text = null;

        System.out.println(text.length());
*/

        String[] texts = {"one", "two", "three"};

        try {
            System.out.println(texts[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
    }
}
