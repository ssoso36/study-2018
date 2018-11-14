package com.example.study2018.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

    public static void main(String[] args) {

        /*
            Java Queue interface orders the element in FIFO(First In First Out) manner. In FIFO
            peek : It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
            poll : It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.
         */


        System.out.println("**** PriorityQueue ****");
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.add("a");
        queue1.add("b");
        queue1.add("c");
        queue1.add("d");
        queue1.add("e");

        System.out.println("poll1 : " + queue1.poll());
        System.out.println("poll2 : " + queue1.poll());
        System.out.println("poll3 : " + queue1.poll());
        System.out.println("peak : " + queue1.peek());
        System.out.println("head : " + queue1.element());
        System.out.println("head : " + queue1.peek());

        Iterator itr1 = queue1.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        queue1.remove();
        queue1.poll();

        Iterator itr2 = queue1.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        System.out.println("**** Deque ****");
        Deque<String> deque = new ArrayDeque<>();
        deque.offer("a");
        deque.offer("b");
        deque.offer("c");
        deque.offer("d");
        deque.addFirst("1");
        deque.offerFirst("0");
        deque.addLast("2");

        for (String s : deque) {
            System.out.println(s);
        }

        System.out.println("first : " + deque.getFirst());
        System.out.println("last : " + deque.getLast());

        System.out.println(deque.pollFirst());
        System.out.println(deque.getFirst());

    }

}
