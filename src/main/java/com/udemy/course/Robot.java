package com.udemy.course;

public class Robot {

    int age;

    public void speak(String name){
        System.out.println("Hello i am " + name);
    }

    public void sayAge(int age){
        System.out.println("Hello i am " + age);
    }

    public int getAge() {
        return age;
    }
}
