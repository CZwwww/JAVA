package com.xms.newtime;

import java.util.Optional;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author czw
 * @create 2021-07-02-上午 11:15
 */
public class SellWindow implements Runnable{
    Optional<String> name = Optional.ofNullable("");
    public static final Lock LOCK = new ReentrantLock();
    public static int tickets = 100;
    public void run(){
//        LOCK.lock();
        while(true){
            LOCK.lock();
            if(tickets==0)
                break;
            if(!name.orElse("").equals(Thread.currentThread().getName()))
            sell();
            LOCK.unlock();
//            try {
//                Thread.sleep(100);
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }

        }
//        LOCK.unlock();
    }
    public  void sell() {
        tickets--;
        name = Optional.ofNullable(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName() + "+" + tickets);
    }


}