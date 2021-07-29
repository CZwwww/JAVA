package com.xms.lambda;

import java.util.function.Function;

/**
 * @author czw
 * @create 2021-06-25-下午 4:49
 */
public class LambdaDemo03 {
    public static void main(String[] args) {
        System.out.println(fun1("123",Integer::parseInt));
        System.out.println(fun1("123",s->Integer.parseInt(s)+5));
        System.out.println(fun1("123",Integer::parseInt,integer -> integer*5));
    }
    public static Integer fun1(String str,Function<String,Integer> func){
        return func.apply(str);
    }
    public static Integer fun1(String str,Function<String,Integer> func,Function<Integer,Integer> func1){
        return func.andThen(func1).apply(str);
    }
}
