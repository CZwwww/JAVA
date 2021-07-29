package com.xms.Stream;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Stream流的中间操作
 * 中间操作返回当前流对象
 * 只有当执行了终止操作时,中间操作会一次性全部执行,否则中间操作不执行(惰性求值)
 * @author czw
 * @create 2021-06-28-上午 11:38
 */
public class Demo02 {
    List<String> list;
    @Before
    public void init(){
        //数据源
        list = Arrays.asList("Tom","Jerry","Tomy","Tomas","Tom");
    }
    //筛选与切片
    @Test
    public void test(){
        //filter获取所有t开头元素
        list.stream().filter(s->s.startsWith("T")).forEach(System.out::println);
        //获取前两个
        list.stream().limit(2).filter(s->s.startsWith("T")).forEach(System.out::println);
        //distinct:获取所有T开头元素(去重)
        list.stream().filter(s->s.startsWith("T")).distinct().forEach(System.out::println);
        //跳过前两个
        list.stream().skip(2).filter(s->s.startsWith("T")).forEach(System.out::println);
    }

}
