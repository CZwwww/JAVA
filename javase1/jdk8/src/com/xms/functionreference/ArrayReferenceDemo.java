package com.xms.functionreference;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.Function;

/**
 * @author czw
 * @create 2021-06-28-上午 10:42
 */
public class ArrayReferenceDemo {
    @Test
    public void test(){
        Function<Integer,String[]> func = String[]::new;
        System.out.println(Arrays.toString(func.apply(10)));
    }
}
