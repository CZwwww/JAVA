package com.xms.day02;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程通信
 *  需求:
 *      资源类:
 *      生产者:提供资源,从1开始,依次加1;
 *      消费者:消费资源,删除生产者生产的资源
 * @author czw
 * @create 2021-06-21-下午 4:43
 */
public class PCDemo {
    public static void main(String[] args) {
        MyList myList = new MyList();
        Runnable target1 = new ProductRunn(myList);
        Runnable target2 = new CustomRunn(myList);
        Thread t1 = new Thread(target1,"生产1号");
        Thread t2 = new Thread(target1,"生产2号");
        Thread t3 = new Thread(target1,"生产3号");
        Thread t4 = new Thread(target1,"生产4号");
        Thread t5 = new Thread(target2,"消费一号");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
class MyList{
    static int n = 1;
    static int size = 0;
    static List<Integer> list = new ArrayList<>();
    public static final int MAX_SIZE = 1;
    public static Lock lock = new ReentrantLock();
    public static boolean flag = false;
    //
    public synchronized void addSource(){
        if(size<MAX_SIZE) {
            System.out.println(Thread.currentThread().getName() + "生产的数据为:" + n);
            list.add(n);
            System.out.println(Thread.currentThread().getName() + "生产后的集合:" + list);
            n++;
            size++;
        }
    }
    public synchronized void removeSource(){
        if(size!=0){
            Integer value = list.remove(0);
            System.out.println("消费的数据为"+value);
            System.out.println("消费后的集合为:"+list);
            size--;
        }
    }
}
class CustomRunn implements Runnable{
    MyList myList;

    public CustomRunn(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {

        while(true){
            myList.removeSource();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(MyList.flag) {
                MyList.lock.notify();
                MyList.flag = false;
            }
        }
    }
}
class ProductRunn implements Runnable {
    MyList myList;

    public ProductRunn(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        if(MyList.size==MyList.MAX_SIZE) {
            try {
                MyList.lock.wait();
                MyList.flag = true;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while(true){
            myList.addSource();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}