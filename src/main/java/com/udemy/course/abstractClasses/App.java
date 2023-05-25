package com.udemy.course.abstractClasses;

public class App {
    public static void main(String[] args) {

        Camera camera = new Camera();
        camera.setId(5);

        Car car = new Car();
        car.setId(4);

        //Can't instantiate because it's abstract
        //Machine machine = new Machine();

        camera.run();
        car.run();

    }
}
