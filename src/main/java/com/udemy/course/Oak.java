package com.udemy.course;

public class Oak extends Plant{

    public Oak() {


        //will be error because variable type is private variable in Plant class//
        //type = "tree";

        //will work because variable type is protected variable in Plant class, and Oak is subclass of Plant//
        this.size = "large";
    }
}
