package com.xms.day02;

/**
 * @author czw
 * @create 2021-06-21-上午 9:35
 */
public class SleepThreadDemo {

            public static void main(String[] args) {
                Thread t1 = new Thread(() -> {
                    for(int i = 0;i<100;i++){
                        System.out.println(Thread.currentThread().getName()+"--"+i);
                        try {
                            //休眠时间到期,当线程抢到CPU时间片段之后会执行之前线程休眠前未执行完的方法
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("=---------------");
                    }

                },"线程1");
                Thread t2 = new Thread(() -> {
                    for(int i = 0;i<100;i++){
                        System.out.println(Thread.currentThread().getName()+"--"+i);
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
        },"线程2");
        t1.start();
        t2.start();
    }
}
