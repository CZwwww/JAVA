package com.xms;

/**
 * @author czw
 * @create 2021-06-24-上午 11:30
 */
public class Calculator {
    @Check
    public void add(){
        System.out.println(1+2);
    }
    @Check
    public void sub(){
        System.out.println(5-3);
    }
    @Check
    public void multiply(){
        System.out.println(3*3);
    }
    @Check
    public void divide(){
        System.out.println(5/0);
    }
    @Check
    public void show(){
        String s = null;
        System.out.println(s.charAt(0));
    }
}
