package com.xms.day03;

/**
 * 死锁
 *  多个线程抢夺资源过程中,发生的相互等待现象
 * @author czw
 * @create 2021-06-22-上午 9:36
 */
public class DeadLockDemo {
    public static void main(String[] args) {
        Thread t1 = new MyLockThread(true);
        Thread t2 = new MyLockThread(false);
        t1.start();
        t2.start();
    }
}
class Mylock{
    public static final Object objA = new Object();
    public static final  Object objB = new Object();
}
class MyLockThread extends Thread {
    boolean flag;

    public MyLockThread(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (Mylock.objA) {
                System.out.println(getName() + "--lock is objA");
                synchronized (Mylock.objB) {
                    System.out.println(getName() + "--lock is objB");
                }
            }
        } else {
            synchronized (Mylock.objB) {
                System.out.println(getName() + "--lock is objB");
                synchronized (Mylock.objA) {
                    System.out.println(getName() + "--lock is objA");
                }
            }
        }
    }
}