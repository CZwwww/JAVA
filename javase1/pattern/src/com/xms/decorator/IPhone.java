package com.xms.decorator;

/**
 * @author czw
 * @create 2021-06-23-下午 2:27
 */
public class IPhone implements Phone {
    @Override
    public void function() {
        System.out.println("打电话");
    }
}
