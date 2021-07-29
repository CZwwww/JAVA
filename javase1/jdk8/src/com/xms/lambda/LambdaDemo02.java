package com.xms.lambda;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author czw
 * @create 2021-06-25-下午 4:19
 */
public class LambdaDemo02 {
    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
        demo4("断言型",""::equals);
    }

    private static void demo4(String str,Predicate<String> p1) {
        p1.test(str);
    }

    private static void demo3() {
        Function<Integer,String> func = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return "函数型接口";
            }
        };
        Function<Integer,String> func1 = i->"函数型接口";
    }

    private static void demo2() {
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "供给型接口";
            }

        };
        Supplier<String> supplier1 = ()->"供给型接口";
    }

    private static void demo1() {
        Runnable target = new Runnable() {
            public void run() {
                System.out.println("多线程任务1");
            }
        };
        Runnable target1 = ()-> System.out.println("多线程任务2");


    }
}
