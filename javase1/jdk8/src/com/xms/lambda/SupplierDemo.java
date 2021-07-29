package com.xms.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/**
 * @author czw
 * @create 2021-06-25-下午 5:15
 */
public class SupplierDemo {
    public static void main(String[] args) {
        getRandom(()->new Random().nextInt(100));
    }
    private static List<Integer> getRandom(Supplier<Integer> supplier){
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<10;i++){
            list.add(supplier.get());
        }
        return list;
    }
}
