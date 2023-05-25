package com.udemy.course.collections.usingCustomObjInSetsAndAsAKeysInMaps;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Person p1 = new Person(0, "Bob");
        Person p2 = new Person(1, "Sue");
        Person p3 = new Person(2, "Mike");
        Person p4 = new Person(1, "Sue");

        Map<Person,Integer> map = new LinkedHashMap<>();

        map.put(p1,1);
        map.put(p2,2);
        map.put(p3,3);
        map.put(p4,1);

        for (Person key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        System.out.println("\n");

        Set<Person> set = new LinkedHashSet<Person>();

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        System.out.println(set);

    }

}
