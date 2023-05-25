package com.udemy.course.collections.sortingLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {

        //Sorting strings//
        List<String> animals = new ArrayList<String>();

        animals.add("tiger");
        animals.add("lion");
        animals.add("cat");
        animals.add("snake");
        animals.add("mongoose");
        animals.add("elephant");

        //Not-sorted strings
        System.out.println("\n--Not sorted strings--");
        Collections.sort(animals);

        for (String animal_value: animals) {
            System.out.println(animal_value);
        }

        //Sorting by String length
        System.out.println("\n---Sorting by String length---");
        Collections.sort(animals, new StringLenghtComparator());

        for (String animal_value: animals) {
            System.out.println(animal_value);
        }

        //Sorting by Alphabetic
        System.out.println("\n---Sorting by Alphabetic---");
        Collections.sort(animals, new AlphabeticalComparator());

        for (String animal_value: animals) {
            System.out.println(animal_value);
        }

        //Sorting by Reverse Alphabetic
        System.out.println("\n---Sorting by Reverse Alphabetic---");
        Collections.sort(animals, new ReverseAlphabeticalComparator());

        for (String animal_value: animals) {
            System.out.println(animal_value);
        }

        //Sorting numbers//
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(3);
        numbers.add(36);
        numbers.add(73);
        numbers.add(40);
        numbers.add(1);

        //Not-sorted numbers
        System.out.println("\n--Not sorted numbers--");
        Collections.sort(numbers);

        for (Integer numbers_value: numbers) {
            System.out.println(numbers_value);
        }

        //Sorting numbers
        System.out.println("\nSorting numbers");

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num1.compareTo(num2);
            }
        });

        for (Integer numbers_value: numbers) {
            System.out.println(numbers_value);
        }

        //Reveser sorting numbers
        System.out.println("\nReverse sorting numbers");

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return -num1.compareTo(num2);
            }
        });

        for (Integer numbers_value: numbers) {
            System.out.println(numbers_value);
        }

        //Sorting Objects//
        List<Person> people = new ArrayList<Person>();

        people.add(new Person(1,"Joe"));
        people.add(new Person(4,"Clara"));
        people.add(new Person(3,"Bob"));
        people.add(new Person(2,"Sue"));

        //Won't be work because it's' not Str or Int or ...
        //Collections.sort(people);

        //Not-sorted objects
        System.out.println("\n--Not sorted objects--");
        for (Person person: people) {
            System.out.println(person);
        }

        //Sorted objects by id
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.getId() > p2.getId()){
                    return 1;
                }
                if (p1.getId() < p2.getId()){
                    return -1;
                }
                return 0;
            }

        });

        System.out.println("\n--Sorted objects by id--");
        for (Person person: people) {
            System.out.println(person);
        }

        //Sorted objects by id reversed
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.getId() < p2.getId()){
                    return 1;
                }
                if (p1.getId() > p2.getId()){
                    return -1;
                }
                return 0;
            }

        });

        System.out.println("\n--Sorted objects by id reversed--");
        for (Person person: people) {
            System.out.println(person);
        }

        //Sorted objects by alphabet
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }

        });

        System.out.println("\n--Sorted objects by alphabet--");
        for (Person person: people) {
            System.out.println(person);
        }

        //Sorted objects by reversed alphabet
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return -p1.getName().compareTo(p2.getName());
            }

        });

        System.out.println("\n--Sorted objects by reversed alphabet--");
        for (Person person: people) {
            System.out.println(person);
        }

    }

}
