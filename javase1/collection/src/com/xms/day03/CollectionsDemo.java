package com.xms.day03;

import java.util.ArrayList;
import java.util.List;

/**
 * @author czw
 * @create 2021-06-16-上午 10:04
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<String[]> list = new ArrayList<>();
        list.add(new String[]{"a", "b", "c"});
        list.add(new String[]{"a","b"});
        list.add(new String[]{"a"});
        list.forEach(System.out::println);
//        Collections.reverse(list);
//        System.out.println(list);
//        Collections.shuffle(list);
//        System.out.println(list);
//        Collections.sort(list);
//
//        System.out.println(list);
////        Collections.sort(list, Comparator.reverseOrder());
////        System.out.println(list);
//        System.out.println(Collections.binarySearch(list,"tom"));
////        Collections.max()
    }
}
