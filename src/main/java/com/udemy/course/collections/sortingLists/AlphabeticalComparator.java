package com.udemy.course.collections.sortingLists;

import java.util.Comparator;

public class AlphabeticalComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }
}
