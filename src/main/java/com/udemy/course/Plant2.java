package com.udemy.course;

public class Plant2 {

    public static final int ID = 7;
    private String name;

    public String getData() {
        String data = "some forecast" + calculateGrowthForecast();
        return data;
    }

    private int calculateGrowthForecast(){
        return 9;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
