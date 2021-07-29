package com.xms.day01;

import org.junit.Test;

/**
 * @author czw
 * @create 2021-06-22-下午 2:21
 */
public class Demo {
    @Test
    public void test(){
        seasonEnum spring = seasonEnum.SPRING;
        seasonEnum[] values = seasonEnum.values();
        for (seasonEnum value : values) {
            System.out.println(value);
        }
        seasonEnum winter = seasonEnum.valueOf("WINTER");
        System.out.println(winter);
    }
    @Test
    public void test3(){
        seasonEnum spring = seasonEnum.valueOf("SPRING");
        spring.showInfo();
    }
}
