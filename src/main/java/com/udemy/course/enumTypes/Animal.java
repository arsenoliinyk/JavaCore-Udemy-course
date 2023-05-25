package com.udemy.course.enumTypes;

public enum Animal {
    CAT("Fergus"), DOG("Duke"), MOUSE("Jerry");

    String name;

    Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "This animal name is " + name ;
    }
}
