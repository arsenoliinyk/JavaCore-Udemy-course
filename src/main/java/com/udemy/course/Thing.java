package com.udemy.course;


public class Thing {
    public String name;
    public static String description;
    public static int count = 0;
    public int id;

    public Thing(){
        id = count;
        count++;
    }

    public void showName(){
        System.out.println("This is my id: " + id + ", " + description + ": " + name);
    }

    public static void showInfo(){
        System.out.println(description);
        //System.out.println(name); //error because STATIC method can use only Static variables
    }
}
