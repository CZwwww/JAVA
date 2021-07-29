package com.xms.day01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author czw
 * @create 2021-06-11-上午 11:19
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add(1,"javase");
        list.set(list.size()-1,"javase");
        System.out.println(list);
    }
    private static void showList(List list){
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
