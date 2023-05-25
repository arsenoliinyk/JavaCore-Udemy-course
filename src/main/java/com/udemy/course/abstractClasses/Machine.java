package com.udemy.course.abstractClasses;

public abstract class Machine {

    private int Id;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public abstract void start();
    public abstract void doStuff();
    public abstract void shutDown();

    public void run(){

        start();
        doStuff();
        shutDown();

    }

}
