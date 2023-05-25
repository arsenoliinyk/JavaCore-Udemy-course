package com.udemy.course.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        ArrayList<Integer> numbers= new ArrayList<Integer>();

        //Adding
        numbers.add(40);
        numbers.add(50);
        numbers.add(100);

        //Retrieving
        System.out.println(numbers.get(0));

        System.out.println("\nIndexing №1");
        //Indexing
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        //Removing items (carefully!)
        numbers.remove(numbers.size() - 1);

        //Removing items (VERY slow)
        numbers.remove(0);

        System.out.println("\nIndexing №2");
        //Indexing
        for (Integer value: numbers) {
            System.out.println(value);
        }

        //List interface ...
        List<String> values = new ArrayList<String>();
    }

}
