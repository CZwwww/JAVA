package com.xms.lambda;

import java.util.function.Consumer;

/**
 * @author czw
 * @create 2021-06-25-下午 5:07
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        shopping(System.out::println,3000.0);
        func(s-> System.out.println(s.toUpperCase()),s-> System.out.println(s.toLowerCase()),"Hello");
    }
    public static void shopping(Consumer<Double> c,Double money){
        c.accept(money);
    }
    private static void func(Consumer<String> one,Consumer<String> two,String str){
        one.andThen(two).accept(str);
    }
}
