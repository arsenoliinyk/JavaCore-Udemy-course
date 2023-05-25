package com.udemy.course.collections.hashMap;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Person person) {

        int len1 = name.length();
        int len2 = person.name.length();

        if (len1 > len2) {
            return 1;
        }
        if (len2 > len1) {
            return -1;
        }
        return name.compareTo(person.name);

        /*
        //Sort by alphabet
        return name.compareTo(person.name);
        */
    }

}
