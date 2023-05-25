package com.udemy.course.serialization.savingObjectsToFiles;

import java.io.Serializable;

public class Person implements Serializable {

    private int ID;
    private String name;

    public Person(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "ID=" + ID + ", name='" + name + '\'' + '}';
    }
}
