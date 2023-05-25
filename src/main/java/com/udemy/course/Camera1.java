package com.udemy.course;

public class Camera1 extends Machine3{

    @Override
    public String toString() {
        return "I'm a Camera";
    }

    public void snap() {
        System.out.println("Snap!");
    }
}
