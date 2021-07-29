package com.xms.day01;

/**
 * @author czw
 * @create 2021-06-18-下午 5:29
 */
public class MyThreadDemo02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread("1"){
            boolean flag;
            @Override
            public void run() {
                if(flag){
                    for(int i = 0;i<100;i++){
                        System.out.println(getName()+"-"+i);
                    }
                }else{
                    for(int i = 100;i<200;i++){
                        System.out.println(getName()+"-"+i);
                    }
                }
            }
        };

        t1.start();
        Thread.sleep(1000);
        System.out.println(t1.isAlive());
    }
}
