package com.xms.day01.ganeric;

import java.util.ArrayList;
import java.util.List;

/**
 * @author czw
 * @create 2021-06-11-下午 4:51
 */
public class GenericDemo03 {
    public static void main(String[] args) {
        List<Number> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Object> list3 = new ArrayList<>();

        demo01(list1);
        demo03(list1);
        demo03(list3);

    }

    private static void demo01(List<?extends Object> list) {
    }
    private static void demo02(List<?> list){

    }
    private static void demo03(List<?super Integer> list){

    }
}
