package com.xms.day02;

/**
 * @author czw
 * @create 2021-06-21-上午 10:16
 */
public class JoinThreadDemo  {
    public static void main(String[] args) throws InterruptedException {
        Player p1 = new Player("张全蛋",6000);
        Player p2 = new Player("李二狗",8000);
        Player p3 = new Player("赵小六",10000);
        Player p4 = new Player("王小二",12000);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p4.join();
        System.out.println("人齐了开局");

    }
}
class Player extends Thread{
    long time;
    String name;
    public Player(String name,long time){
        this.name = name;
        this.time = time;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+"花费了"+time+"时间");
    }
}