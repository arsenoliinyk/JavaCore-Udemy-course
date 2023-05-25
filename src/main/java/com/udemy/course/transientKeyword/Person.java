package com.udemy.course.transientKeyword;

import java.io.Serializable;

public class Person implements Serializable {

    private transient int ID;
    private String name;
    //static field is not serializable
    private static int count;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    public Person() {
        System.out.println("default constructor");
    }

    public Person(int ID, String name) {
        this.ID = ID;
        this.name = name;

        System.out.println("two-argument constructor");
    }

    @Override
    public String toString() {
        return "Person{" + "ID=" + ID + ", name='" + name + '\'' + "} Count is: " + count;
    }
}
