package com.udemy.course.interfaces;

public class Person implements Info{

    private String name;

    public void greet() {
        System.out.println("Hello there.");
    }

    public Person(String name) {
        this.name = name;
    }
    @Override
    public void showInfo() {
        System.out.println("Person's name is " + name);
    }

}
