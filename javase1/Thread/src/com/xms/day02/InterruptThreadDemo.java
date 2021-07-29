package com.xms.day02;

/**
 * @author czw
 * @create 2021-06-21-上午 11:15
 */
public class InterruptThreadDemo {
    public static void main(String[] args) {
        InterruptThread it = new InterruptThread();
        it.setName("线程1");
        InterruptThread it1 = new InterruptThread();
        it1.setName("线程2");
        it.setPriority(Thread.MAX_PRIORITY);
        it1.setPriority(Thread.MIN_PRIORITY);
        it.start();
        it1.start();
    }
}
class InterruptThread extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            System.out.println(getName()+"--"+i);
        }
    }
}
