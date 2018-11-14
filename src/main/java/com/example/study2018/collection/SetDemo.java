package com.example.study2018.collection;

import lombok.AllArgsConstructor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {

        /*
            contains unique elements only.
            not maintains insertion order.
         */

        System.out.println("**** HashSet ****");
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("c");
        set.add(null);
        set.add("b");
        set.add("c");

        Iterator<String> itr1 = set.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        Book book1 = new Book(1, "a");
        Book book2 = new Book(1, "b");
        Book book3 = new Book(1, "a");
        Book book4 = new Book(4, "d");
        Book book5 = new Book(1, "a");

        HashSet<Book> setBook = new HashSet<>();
        setBook.add(book1);
        setBook.add(book2);
        setBook.add(book3);
        setBook.add(book4);
        setBook.add(book5);

        Iterator<Book> itr2 = setBook.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        System.out.println("**** LinkedHashSet ****");

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("a");
        set2.add("c");
        set2.add("b");
        set2.add("c");

        Iterator<String> itr3 = set2.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }

        System.out.println("**** TreeSet ****");

        TreeSet<String> tree1 = new TreeSet<>();
        tree1.add("a");
        tree1.add("c");
        tree1.add("b");
        tree1.add("c");

        Iterator<String> itr4 = tree1.iterator();
        while(itr4.hasNext()){
            System.out.println(itr4.next());
        }
    }

    @AllArgsConstructor
    public static class Book {
        Integer seq;
        String title;

        @Override
        public String toString() {
            return this.seq  + ":" + this.title;
        }
    }
}
