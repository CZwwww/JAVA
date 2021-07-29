package com.xms.day01;

/**
 * @author czw
 * @create 2021-06-11-下午 4:27
 */
public class MyLinkedTest {
    public static void main(String[] args) {
        MyLinked1<String> myLinked = new MyLinked1<>();
        myLinked.add("A");
        myLinked.add("B");
        myLinked.add("C");
        myLinked.remove("A");
        myLinked.remove("B");
        myLinked.remove("C");
    }
}
