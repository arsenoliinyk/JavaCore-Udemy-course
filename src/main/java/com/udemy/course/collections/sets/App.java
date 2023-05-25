package com.udemy.course.collections.sets;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {

        //HashSet does not retain order
        Set<String> set1 = new HashSet<String>();
        //LinkedHashSet remembers the order you added items in
        Set<String> set2 = new LinkedHashSet<String>();
        //TreeSet sorts in natural order [A,B,C,...1,2,3]
        Set<String> set3 = new TreeSet<String>();

        //Checking if it's empty
        if (set1.isEmpty()) {
            System.out.println("Set is empty at start");
        }

        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");

        if (set1.isEmpty()) {
            System.out.println("Set is empty at start");
        } else {
            System.out.println("Set is filled at the end");
        }

        set2.add("dog");
        set2.add("cat");
        set2.add("mouse");
        set2.add("snake");
        set2.add("bear");

        set3.add("dog");
        set3.add("cat");
        set3.add("mouse");
        set3.add("snake");
        set3.add("bear");

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

        //Iteration//
        System.out.println("\n---Iteration---");
        for (String element: set1){
            System.out.println(element);
        }

        //Does set contains a givem item?//
        System.out.println("\n---Does set contains a givem item?---");
        if (set1.contains("aardvark")) {
            System.out.println("Set contains aardvark");
        } else {
            System.out.println("Set does not contain aardvark");
        }

        if (set1.contains("cat")) {
            System.out.println("Set contains cat");
        }

        //Set4 contains some common elements to set1 and some new

        Set<String> set4 = new TreeSet<String>();

        set4.add("dog");
        set4.add("cat");
        set4.add("giraffe");
        set4.add("monkey");
        set4.add("ant");

        //Intersection//
        System.out.println("\n---Intersection---");

        Set<String> intersection = new HashSet<>(set1);
        System.out.println(intersection);
        intersection.retainAll(set4);
        System.out.println(intersection);

        //Difference//
        System.out.println("\n---Difference---");

        Set<String> difference = new HashSet<>(set4);
        System.out.println(difference);
        difference.removeAll(set1);
        System.out.println(difference);

    }

}
