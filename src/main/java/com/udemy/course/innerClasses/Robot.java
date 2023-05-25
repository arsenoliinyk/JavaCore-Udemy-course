package com.udemy.course.innerClasses;

public class Robot {

    private int id;

    ///1 non-static inner class (nested classes)
    ///uses to group together some functionality and have access to the instance variables of the enclosing outer class
    ///it will have access to instance data of the robot class
    ///using just to grouping bits of outer classes
    private class Brain {
        public void think() {
            System.out.println("Robot " + id + "is thinking.");
        }
    }

    ///2 static inner class
    ///usually using for grouping classes together
    ///uses when u just want normal class that isn't assotiated with intances of the enclosing outer class ---
    ///but for some reason you want to group it with outer class
    ///because of it's static, we can't refer to id, because for every obj it's unique
    public static class Battery {
        public void charge() {
            System.out.println("Battery charging.");
        }
    }

    public Robot(int id) {
        this.id = id;
    }

    public void start(){
        System.out.println("Starting robot " + id);

        Brain brain = new Brain();
        brain.think();

        final String name = "Robert";

        class Temp {
            public void doSomething() {
                System.out.println("Id is: " + id);
                System.out.println("My name is " + name);
            }
        }

        Temp temp = new Temp();
        temp.doSomething();

    }
}
