package com.xms.day03;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author czw
 * @create 2021-06-16-上午 10:39
 */
public class HashTableDemo implements Cloneable{
    public static void main(String[] args) {
        Hashtable<String,String> ht = new Hashtable<>();
//        ht.put(null,null);
//        ht.put(null,"张三");
        ht.put("1","李四");


        HashMap<String,String> hm = new HashMap<>();
//        hm.put(null,null);
        hm.put(null,"张三");
        hm.put("1","李四");
        System.out.println(hm.get(null));
        System.out.println(hm);
    }

}
