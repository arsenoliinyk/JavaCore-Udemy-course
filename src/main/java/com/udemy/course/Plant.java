package com.udemy.course;

public class Plant {
    //Bad practice//
    public String name;

    //Accaptable practice//
    public final static int ID = 8;

    private String type;

    protected String size;

    public Plant() {
        this.name = "Freddy";
        this.type = "plant";
        this.size = "medium";
    }

}
