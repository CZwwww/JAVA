package com.xms.day02;

import java.util.Stack;

/**
 * @author czw
 * @create 2021-06-15-上午 11:50
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        stack.push("Java");
//        System.out.println(stack.peek());
        while(stack.size()!=0){
            System.out.println(stack.pop());
        }
    }
}
