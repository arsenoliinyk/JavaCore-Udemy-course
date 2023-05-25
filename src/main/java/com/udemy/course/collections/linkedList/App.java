package com.udemy.course.collections.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        /*
        * ArrayList manage arrays internally
        * [1][2][3][4][5]...
        */
        List<Integer> arrayList = new ArrayList<Integer>();
        /*
        * LinkedList consists of elements where each element
        * has a reference to the previous and next element
        * [0]->[1]->[2]->[3]->[4]->...
        *    <-   <-   <-   <-   <-
        */
        List<Integer> linkedList = new LinkedList<Integer>();

        doTiming("ArrayList", arrayList);
        doTiming("LinkedList", linkedList);

    }

    public static void doTiming(String type, List<Integer> list) {

        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }

        double start = System.currentTimeMillis();

        /*
        //Adding items to end of the list
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
         */

        //Adding items elsewhere in the list
        for (int i = 0; i < 1E5; i++) {
            list.add(0, i);
        }
        double end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms for " + type);

    }

}
