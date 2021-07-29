package com.xms.newtime;

/**
 * @author czw
 * @create 2021-06-29-下午 6:10
 */
public class ZoneIdDemo {
    public static void main(String[] args) {
        Runnable r = new SellWindow();
        Thread t1 = new Thread(r,"Window1");
        Thread t2 = new Thread(r,"Window2");
        Thread t3 = new Thread(r,"Window3");
        t1.start();
        t2.start();
        t3.start();
    }
}
