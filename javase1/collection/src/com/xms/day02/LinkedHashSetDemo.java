package com.xms.day02;

import java.util.LinkedHashSet;

/**
 * @author czw
 * @create 2021-06-15-下午 3:14
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("hello");
        set.add("java");
        set.add("jerry");
        set.add("tom");
        set.add("li");
        set.iterator().forEachRemaining(System.out::println);
    }
}
