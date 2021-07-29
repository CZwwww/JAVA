package com.xms.day02;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author czw
 * @create 2021-06-21-下午 4:19
 */
public class Demo05 {
    public static void main(String[] args) {
        Thread t = new STWindows();
        Thread t1 = new STWindows();
        Thread t2 = new STWindows();
        t.setName("Window01");
        t1.setName("Window02");
        t2.setName("Window03");
        t.start();
        t1.start();
        t2.start();
    }

}
class STWindows extends Thread{
    static int ticket = 100;
    public static Lock lock = new ReentrantLock();
    @Override
    public void run(){
        while(true){
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            lock.lock();
            System.out.println(getName()+"--"+(ticket--)+"票");
            lock.unlock();

            if(ticket<0) break;

        }
    }
}