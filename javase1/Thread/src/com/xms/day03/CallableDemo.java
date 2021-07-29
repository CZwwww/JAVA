package com.xms.day03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author czw
 * @create 2021-06-22-上午 10:26
 */
public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> futureTask = new FutureTask<>(() -> {
            int sum = 0;
            for (int i = 0; i <= 100; i += 2) {
                sum += i;
            }
            return sum;
        });
        Thread t = new Thread(futureTask);
        t.start();
        System.out.println((Integer) futureTask.get());

    }
}