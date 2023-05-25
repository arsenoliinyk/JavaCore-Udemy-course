package com.udemy.course.equalsMethods;

public class App {

    public static void main(String[] args) {

        Person person1 = new Person(5, "Boby");
        Person person2 = new Person(5, "Bob");

        System.out.println("Comparing 2 variables of 2 objects:");
        System.out.println(person1.equals(person2));

        Double value1 = 7.2;
        Double value2 = 7.2;

        System.out.println("Comparing double:");
        //first time it false because java maybe create 2 obj to compare double, because it contains more info
        // == is only checking if two references of obj are pointing at the same obj
        // .equals will tell if the variables equals in terms of value
        System.out.println(value1 == value2);
        System.out.println(value1.equals(value2));

        Integer number1 = 6;
        Integer number2 = 6;

        System.out.println("Comparing integers:");
        System.out.println(number1 == number2);

        String text1 = "Hello";
        String text2 = "Hello".substring(0, 5);
        System.out.println(" ");
        System.out.println(text2);

        //in this way java is optimised, it points these two references at the exact same obj
        System.out.println("Comparing strings:");
        System.out.println(text1 == text2);
        System.out.println(text1.equals(text2));

        ////DON'T COMPARE NON-PRIMITIVE NUMBERS WITH ==
        //// == USE ONLY TO CHECK IF TWO REFERENCES POINTING AT THE SAME OBJECT
        ////WITH STRINGS EVERYTHING IS THE SAME, TO COMPARE VALUES WE NEED TO USE .EQUALS

    }

}
