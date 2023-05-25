package com.udemy.course.tryWithResources;

public class App {

    public static void main(String[] args) {
/*

        Temp temp = new Temp();

        try {
            temp.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
*/

        try(Temp temp = new Temp()){

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
