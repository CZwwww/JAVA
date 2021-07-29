package com.xms.decorator;

import org.junit.Test;

/**
 * @author czw
 * @create 2021-06-23-下午 2:33
 */
public class PhoneDecoratorTest {
    @Test
    public void test(){
        Phone iphoneX = new PhoneDecorate(new PhoneDecorate(new IPhone4(new IPhone())){
            @Override
            public void function() {
                System.out.println("发短信");
                super.function();
            }
        }){
            @Override
            public void function() {
                System.out.println("GPS定位");
                super.function();
            }
        };
        iphoneX.function();
    }
}
