package com.udemy.course;

public class Cat {

    private int id;
    private String name;

    public Cat(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
/*
        //--1st version//
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
        return sb.toString();
*/
        //--2st version//
        return String.format("%4d: %s", id, name);
    }
}
