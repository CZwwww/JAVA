package com.xms.day02;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author czw
 * @create 2021-06-15-上午 11:42
 */
public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offer("A");
        deque.offer("B");
        deque.offer("C");
        while(deque.size()!=0){
            System.out.println(deque.pop());//出队弹栈结果只和入队/栈方法有关
        }
    }



}
