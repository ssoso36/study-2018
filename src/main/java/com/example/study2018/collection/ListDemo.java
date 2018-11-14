package com.example.study2018.collection;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        // https://www.javatpoint.com/java-arraylist

        /*
            - Vector
            Java1 버전 대에서 제일 먼저 등장해서 아무도 없을 때는 요놈만 썼다.
            또한 동기화를 보장해주어 공유 자원이나 복수의 사용자가 존재할 때 좀 더 안전하게 프로그램을 작성할 수 있다.
            하지만 하나의 스레드가 하나의 자원을 이용하는 경우에는 오히려 성능의 저하가 발생한다.
            또한 공간이 모자를 때 모자른 공간x2 만큼의 공간을 확보하기 때문에 메모리를 많이 잡아먹는다는 단점도 존재한다.

            - ArrayList
            Array처럼 인덱스를 가지고 있어서 검색에 용이하다.
            하지만 삽입/삭제를 하려면 중간에 한칸씩 땡기거나 뒤로 밀어야하기 때문에 삽입과 삭제가 빈번한 데이터인 경우에는 부적합하다.
            Vector와 달리 동기화를 보장해주지 못하고, 공간이 모자를 때는 모자른 만큼만 공간을 확보한다.

            - LinkedList
            노드(데이터와 다음 노드로 연결시킬 주소지)들이 줄줄이 연결된다.
            맨 마지막 것을 처음부터 끝까지 노드를 타고 줄줄이 이동해야해서 검색에는 적합하지 않다.
            하지만 삭제/삽입을 할 때는 중간에 해당 노드의 주소지만 바꿔주면 되므로 삽입/삭제가 빈번한 데이터에 적합하다.
         */

        System.out.println("**** ArrayList ****");
        List<String> list1 = new ArrayList();
        list1.add("a");
        list1.add("c");
        list1.add("b");
        list1.add("c");

        Iterator itr1 = list1.iterator();
        while (itr1.hasNext()) {
            System.out.print(itr1.next());
        }

        System.out.println();

        System.out.println("list1.indexOf(\"c\") : " + list1.indexOf("c"));

        ArrayList<String> list1_1 = new ArrayList<>();
        list1_1.add("c");
        list1_1.add("Hanumat");
        list1.retainAll(list1_1);

        Iterator itr11 = list1.iterator();
        while (itr11.hasNext()) {
            System.out.print(itr11.next());
        }

        System.out.println();

        System.out.println("**** LinkedList ****");
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("a");
        list2.add("c");
        list2.add("b");
        list2.add("c");

        Iterator itr2 = list2.iterator();
        while (itr2.hasNext()) {
            System.out.print(itr2.next());
        }

        list2.addFirst("first");
        list2.addLast("last");

        System.out.println();
        Iterator itr22 = list2.iterator();
        while (itr22.hasNext()) {
            System.out.print(itr22.next());
        }

        System.out.println();

        System.out.println("**** Vector ****");
        List<String> list3 = new Vector();
        list3.add("a");
        list3.add("c");
        list3.add("b");
        list3.add("c");

        Iterator itr3 = list3.iterator();
        while (itr3.hasNext()) {
            System.out.print(itr3.next());
        }

        System.out.println();
    }

}
