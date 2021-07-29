package com.xms.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author czw
 * @create 2021-06-25-下午 5:23
 */
public class PredicateDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("tom","jerry","tony","tnt");
        List<String> nl = filter(list, e -> e.startsWith("t"));
//        nl.forEach(System.out::println);
        List<String> list1 = andFun(list, e -> e.startsWith("t", 0), e -> e.startsWith("o", 1));
        list1.forEach(System.out::println);

    }
    private static List<String> filter(List<String> old, Predicate<String> p ){
        List<String> list = new ArrayList<>();
        for (String s : old) {
            if(p.test(s)){
                list.add(s);
            }
        }
        return list;
    }
    private static List<String> andFun(List<String> list,Predicate<String> one,Predicate<String> two){
        List<String> list1 = new ArrayList<>();
        for (String s : list) {
            if(one.and(two).test(s)){
                list1.add(s);
            }
        }
        return list1;
    }
}
