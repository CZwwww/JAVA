package com.xms.day03;

/**
 * @author czw
 * @create 2021-06-25-上午 9:38
 */
class MyThread extends Thread{
    String WhoAmI;
    int delay;
    MyThread(){}
    MyThread(String WhoAmI,int delay){
        this.WhoAmI = WhoAmI;
        this.delay = delay;
    }
    public void run(){
        this.setName(WhoAmI);

    }
}
