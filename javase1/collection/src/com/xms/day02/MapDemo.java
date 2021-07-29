package com.xms.day02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author czw
 * @create 2021-06-15-下午 4:32
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","tom");
        map.put("2","jerry");
        map.put("3", "li");
        map.put("4","jack");
//        map.entrySet().iterator().forEachRemaining(System.out::println);
//        for(Map.Entry<String,String> ignored :map.entrySet()){
////            System.out.println(ignored);
////        }
//        System.out.println(map.isEmpty());
//        System.out.println(map.containsKey("2"));
//        System.out.println(map.containsValue("li"));
        Collection<String> values = map.values();
        values.iterator().forEachRemaining(System.out::println);
    }
}
