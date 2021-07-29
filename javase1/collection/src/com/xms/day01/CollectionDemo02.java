package com.xms.day01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author czw
 * @create 2021-06-11-上午 10:13
 */
public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("hello");
        c.add("java");
        c.add("wor");
//        Iterator it = c.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        Collection c1 = new ArrayList();
        c1.add("hello");
        c1.add("java");
        c1.add("wor");
        System.out.println(c.retainAll(c1));
        System.out.println(c);

    }
}
