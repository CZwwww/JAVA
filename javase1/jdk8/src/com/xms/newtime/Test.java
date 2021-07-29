package com.xms.newtime;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Optional;

/**
 * @author czw
 * @create 2021-06-30-下午 7:57
 */
public class Test {
    @org.junit.Test
    public void test(){
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime parse = LocalDateTime.parse("2020-10-01 23:20:12", dtf);
//        System.out.println(parse);
//        OffsetDateTime odt = parse.atOffset(ZoneOffset.ofHours(8));
        String str= "132";
        Optional<String> s = Optional.ofNullable(str);
        s = Optional.ofNullable("1234");
        System.out.println(s.orElse("213"));

    }
    public void test1(){
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt1 = ldt.with(TemporalAdjusters.lastDayOfMonth());
        Thread t1 = new Thread(){
            int delay;
            String WhoAmI;
            @Override
            public void run() {
                setName(WhoAmI);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
    }
    @org.junit.Test
    public void test3() throws InterruptedException {
        //疑问:线程类的测试在Test测试类中运行有问题
        //答案:测试类的测试方法执行结束后会关闭其内激活的其他线程
        Runnable r = new SellWindow();
        Thread t1 = new Thread(r,"Window1");
        Thread t2 = new Thread(r,"Window2");
        Thread t3 = new Thread(r,"Window3");
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
    }


}
