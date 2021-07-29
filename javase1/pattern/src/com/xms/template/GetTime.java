package com.xms.template;

/**
 * @author czw
 * @create 2021-06-23-上午 11:25
 */
public class GetTime {
    public void geTime(Test t){
        long begin = System.currentTimeMillis();
        t.test();
        long last = System.currentTimeMillis();
        System.out.println(last-begin);
    }
}
interface Test{
    void test();
}