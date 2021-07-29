package com.xms.day01;

import java.util.LinkedList;

/**
 * @author czw
 * @create 2021-06-11-上午 11:45
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("hello");
        list.add("java");
        list.addFirst("first");
        list.addLast("last");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.removeFirst();
        list.removeLast();


    }
}
