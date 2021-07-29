package com.xms.day01;

/**
 * 多线程实现方式1
 * @author czw
 * @create 2021-06-18-下午 4:53
 */
public class MyThreadDemo01 {
    public static void main(String[] args) {
//        MyThread t = new MyThread();
//        MyThread t2 = new MyThread();
//        t.start();
//        t2.start();
        Thread t1 = new Thread(new MyRunnable(),"线程1");
        Thread t2 = new Thread(new MyRunnable(),"线程2");
        t1.start();
        t2.start();
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            System.out.println(getName()+"-"+i);
        }
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}
