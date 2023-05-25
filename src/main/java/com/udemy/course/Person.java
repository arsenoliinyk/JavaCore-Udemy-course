package com.udemy.course;

public class Person{
    //1. Data
    //2. Subroutines(methods)

    String name;
    int age;

    void speak(){
        System.out.println("My name is " + name + " and i am " + age + " years old");
    }

    void sayHello(){
        System.out.println("Hello it's " + name);
    }
    int calculateAgeToRetirement(){
        int yearsLeft = 65 - age;

        return yearsLeft;
    }

    //getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}