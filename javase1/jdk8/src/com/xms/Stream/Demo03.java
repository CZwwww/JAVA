package com.xms.Stream;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author czw
 * @create 2021-06-28-上午 11:55
 */
public class Demo03 {
    List<String> list;
    @Before
    public void init(){
        //数据源
        list = Arrays.asList("Tom","Jerry","Tomy","Tomas","Tom");
    }
    //映射
    @Test
    public void test(){
//        list.stream().map(String::toUpperCase).forEach(System.out::println);
//        list.stream().map(String::toCharArray).forEach(chars -> {
//            for (char aChar : chars) {
//                System.out.println(aChar);
//            }
//        });
//        list.stream().map(s->Arrays.asList(s.toCharArray())).forEach(e->e.forEach(System.out::println));
    }
}
