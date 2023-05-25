package com.udemy.course.enumTypes;

public class App {
/*
    public static final int Dog = 0;
    public static final int CAT = 1;
    public static final int MOUSE = 2;
*/

    public static void main(String[] args) {

        //int animal = CAT;

        Animal animal = Animal.CAT;

        switch (animal) {

        case DOG :
            System.out.println("Dog");
            break;

        case CAT :
            System.out.println("Cat");
            break;

        case MOUSE :
            System.out.println("Mouse");
            break;

        default:
            break;

        }

        System.out.println(Animal.DOG);
        System.out.println("Enum name as a string: " + Animal.DOG.name());
        System.out.println(Animal.DOG.getClass());
        //instanceof tells us if its an instance of a particular class or not
        System.out.println(Animal.DOG instanceof Animal);

        System.out.println(Animal.MOUSE.getName());

        Animal animal2 = Animal.valueOf("CAT");
        System.out.println(animal2);
    }
}
