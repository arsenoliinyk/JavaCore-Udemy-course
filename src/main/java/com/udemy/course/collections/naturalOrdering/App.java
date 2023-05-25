package com.udemy.course.collections.naturalOrdering;

import com.udemy.course.collections.hashMap.Person;
import java.util.*;

public class App {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<Person>();
        SortedSet<Person> set = new TreeSet<Person>();

        addElements(list);
        addElements(set);

        Collections.sort(list);

        showElements(list);
        System.out.println();
        showElements(set);


    }

    public static void addElements(Collection<Person> person) {
        person.add(new Person("Joe"));
        person.add(new Person("Sue"));
        person.add(new Person("Juliet"));
        person.add(new Person("Clare"));
        person.add(new Person("Mike"));
    }

    public static void showElements(Collection<Person> person) {
        for (Person elem: person) {
            System.out.println(elem);
        }
    }

}
