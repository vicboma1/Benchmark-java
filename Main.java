package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        final List<Integer> arrayList = new ArrayList<Integer>();
        final List<Integer> linkedList = new LinkedList<Integer>();

        // ArrayList add
        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("ArrayList add:  " + duration);

        // toArray add
        startTime = System.nanoTime();
        Integer[] array = arrayList.toArray(new Integer[0]);
        for (int i = 0; i < 100000; i++) {
            array[i] = i;
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ToArray() add:  " + duration);

        // LinkedList add
        startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList add: " + duration);

        // Linked toArray add
        startTime = System.nanoTime();
        array = linkedList.toArray(new Integer[0]);
        for (int i = 0; i < 100000; i++) {
            array[i] = i;
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Linked ToArray() add:  " + duration);

        // Integer[]
        startTime = System.nanoTime();
        array = new Integer[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = i;
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Integer add: " + duration);

        // ArrayList get
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList get:  " + duration);

        // LinkedList get
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList get: " + duration);

        // Integer get
        startTime = System.nanoTime();
        array = new Integer[10000];

        for (int i = 0; i < 10000; i++) {
            Integer a = array[i];
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Integer get: " + duration);

        // toArray() get
        startTime = System.nanoTime();
        array = arrayList.toArray(new Integer[0]);

        for (int i = 0; i < 10000; i++) {
            Integer a = array[i];
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ToArray get: " + duration);

        // LtoArray() get
        startTime = System.nanoTime();
        array = linkedList.toArray(new Integer[0]);

        for (int i = 0; i < 10000; i++) {
            Integer a = array[i];
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Linked ToArray get: " + duration);


        // ArrayList remove
        startTime = System.nanoTime();

        for (int i = 9999; i >=0; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList remove:  " + duration);

        // toArray remove
        startTime = System.nanoTime();
        array = arrayList.toArray(new Integer[0]);

        for (int i = array.length-1; i >=0; i--) {
            array[i] = null;
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("toArray remove: " + duration);

        // Integer remove
        startTime = System.nanoTime();
        array = new Integer[9999];

        for (int i = array.length-1; i >=0; i--) {
            array[i] = null;
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Integer remove: " + duration);

        // LinkedList remove
        startTime = System.nanoTime();

        for (int i = 9999; i >=0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList remove: " + duration);

        // LtoArray remove
        startTime = System.nanoTime();
        array = linkedList.toArray(new Integer[0]);

        for (int i = array.length-1; i >=0; i--) {
            array[i] = null;
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Linked toArray remove: " + duration);
    }
}