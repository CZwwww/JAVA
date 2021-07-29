package com.xms.day02;

import java.util.LinkedHashMap;
//import java.util.function.BiConsumer;

/**
 * @author czw
 * @create 2021-06-15-下午 5:46
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lkm = new LinkedHashMap<>();
        lkm.put("zs",50);
        lkm.put("ls",60);
        lkm.put("ww",70);
        lkm.put("tq",80);
        lkm.forEach((s, integer) ->
                System.out.println("name="+s+",score="+integer));
    }
}
