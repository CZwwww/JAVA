package com.xms.day02;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.function.Consumer;

/**
 * @author czw
 * @create 2021-06-15-上午 11:24
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        ListIterator lit = (ListIterator)queue.iterator();
/*        while(lit.hasNext()){
            lit.next();
            lit.remove();
        }*/
        lit.forEachRemaining((Consumer<String>) o -> System.out.println(o));


    }
}
