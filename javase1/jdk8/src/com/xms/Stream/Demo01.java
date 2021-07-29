package com.xms.Stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * !)集合获取
 * Collection::stream():串行流
 * Collection::parallelStream():获取并行流
 * @author czw
 * @create 2021-06-28-上午 11:13
 */
public class Demo01 {
    @Test
    public void test(){
        List<String> list = Arrays.asList("Tom","Jerry","Li","Tomas");

        Stream<String> stream = list.stream();
        IntStream stream1 = Arrays.stream(new int[10]);
        //获取无穷有序流
        Stream<Integer> it = Stream.iterate(1, s -> s+2);
        it.limit(10).forEach(System.out::println);
        //获取无穷无序流
        Stream<Integer> generate = Stream.generate(new Random()::nextInt);
        generate.limit(10).forEach(System.out::println);

    }
}
