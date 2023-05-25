package com.udemy.course.innerClasses;

public class App {

    public static void main(String[] args) {

        Robot robot1 = new Robot(7);

        robot1.start();

        /*
        ////We can do it outside the Robot class
        ////only goona work if access specifier is public
        Robot.Brain brain = robot1.new Brain();
        brain.think();
        */

        Robot.Battery battery = new Robot.Battery();
        battery.charge();



    }

}
