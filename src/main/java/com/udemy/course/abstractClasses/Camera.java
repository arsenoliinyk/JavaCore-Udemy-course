package com.udemy.course.abstractClasses;

public class Camera extends Machine{

    @Override
    public void start() {
        System.out.println("Camera starting..");
    }

    @Override
    public void doStuff() {
        System.out.println("Camera doing stuff..");
    }

    @Override
    public void shutDown() {
        System.out.println("Camera shuts down..");
    }
}
