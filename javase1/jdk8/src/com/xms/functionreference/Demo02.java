package com.xms.functionreference;

import org.junit.Test;

/**
 * @author czw
 * @create 2021-06-28-上午 10:13
 */
interface Greennable{
    void green();
}
class Father{
    public void show(){
        System.out.println("fu");
    }
}
class Son extends Father{
    @Override
    public void show() {
        System.out.println("zi");
    }
    public void func(){
        method(()->new Father().show());
        method(()->super.show());
        method(super::show);
    }
    public void method(Greennable g){
        g.green();
    }
}
public class Demo02 {
    @Test
    public void test01(){
        new Son().func();
    }
}
