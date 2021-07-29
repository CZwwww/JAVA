package com.xms.functionreference;

import org.junit.Test;

/**
 * @author czw
 * @create 2021-06-28-上午 10:23
 */
interface Richer{
    void buy();
}
class Husband{
    public void buyHouse(){
        System.out.println("买房子");
    }
    public void marry(Richer r){
        r.buy();
    }
    public void happy(){
        marry(this::buyHouse);
    }
}
public class Demo03 {
    @Test
    public void test01(){
        new Husband().happy();
    }
}
