package com.xms.functionreference;

import org.junit.Test;

import java.io.InputStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author czw
 * @create 2021-06-28-上午 9:46
 */
public class Demo01 {
    @Test
    public void demo1(){
        //对象::方法
        //需求:打印输出一个字符串
        Consumer<String> con = System.out::println;
        con.accept("hello");


    }
    //类名::方法
    @Test
    public void demo2(){
        Function<Integer,Integer> func = Math::abs;
        System.out.println(func.apply(-10));

        Comparator<Integer> com1 = (a,b)->Integer.compare(a,b);
        Comparator<Integer> com2 = Integer::compare;


    }
    //类名::实例方法
    @Test
    public void demo3(){
        BiPredicate<String,String> bp = (a,b)->a.equals(b);
        BiPredicate<String,String> bp1 = String::equals;

        Function<String,Integer> func = String::hashCode;
        System.out.println( func.apply("hello"));

    }
}
