package com.xms.day02;




/**
 * @author czw
 * @create 2021-06-21-上午 11:37
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        Runnable target = new STWindow();
        Thread t1 = new Thread(target,"窗口1");
        Thread t2 = new Thread(target,"窗口2");
        Thread t3 = new Thread(target,"窗口3");
        t1.start();
        t2.start();
        t3.start();

    }
}
class STWindow implements Runnable {
    private int ticketNum = 100;
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for(;;){
            try {
                Thread.sleep(100);
                if(ticketNum>0) {
                    sell();
                }
                else t.interrupt();

                System.out.println(t.getName() + "售出一张票");
                System.out.println("票还有" + ticketNum + "张");
            } catch (InterruptedException e) {
                System.out.println(t.getName()+"票卖完了");
                return;
            }

        }

    }
    private synchronized void sell(){
        ticketNum--;
    }
}
