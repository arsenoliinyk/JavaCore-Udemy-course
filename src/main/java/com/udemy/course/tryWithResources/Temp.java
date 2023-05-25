package com.udemy.course.tryWithResources;

public class Temp implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Closing...");
        throw new Exception("Oh no!!!");
    }

}
