package com.xms.day03;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author czw
 * @create 2021-06-22-上午 11:18
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor tpe = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        tpe.submit(() -> {
            for(int i=0;i<5;i++) {
                System.out.println(Thread.currentThread().getName());
            }
        });
        tpe.submit(() -> {
            for(int i=0;i<5;i++) {
                System.out.println(Thread.currentThread().getName());
            }
        });
        tpe.setMaximumPoolSize(10);
        tpe.shutdown();
    }
}
