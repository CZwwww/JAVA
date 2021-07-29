package com.xms.proxy;

import org.junit.Test;

/**
 * 静态代理
 * 被代理类(真实类)
 * 代理类:代理真实类的功能
 * @author czw
 * @create 2021-06-23-下午 2:55
 */
public class proxyDemo01 {
    @Test
    public void test(){
        Star star = new Star();
        Broker broker = new Broker(star);
        broker.sing();

    }
}
class Star{
    public void sing(){
        System.out.println("唱歌");
    }
}
class Broker{
    private Star star;

    public Broker(Star star) {
        this.star = star;
    }



    //被代理类代理真实类的功能,并对真实类功能进行扩展
    public void sing(){
        System.out.println("签合同");
        star.sing();
        System.out.println("收钱");
    }
}