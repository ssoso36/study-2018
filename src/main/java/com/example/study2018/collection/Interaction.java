package com.example.study2018.collection;

import java.util.*;

public class Interaction {

    public static void main(String[] args) {

//        Integer[] arr = { 1, 2, 3, 3, 4, 5, 5 };
//        Integer[] arr1 = { 1, 9, 5, 3, 3, 8, 5 };
//        List<Integer> list1 = new ArrayList<Integer>();
//        List<Integer> list2 = new ArrayList<Integer>();
//
//        list1.addAll(Arrays.asList(arr));
//        list2 = Arrays.asList(arr1);
//
//
//        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
//        set.retainAll(Arrays.asList(arr1));
//        System.out.println(set);
//        list1.retainAll(list2);
//        System.out.println(list1);

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);

        List<Integer> list2 = Arrays.asList(4,5,6);
        Set<Integer> set = new HashSet<>(list1);
        set.retainAll(list2);

        for(Integer x : set) {
            System.out.println(x);
        }
    }
}
