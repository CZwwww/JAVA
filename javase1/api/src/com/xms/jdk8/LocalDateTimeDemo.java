package com.xms.jdk8;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

/**
 * @author czw
 * @create 2021-06-24-上午 9:50
 */
public class LocalDateTimeDemo{
    public static void main(String[] args) {
        //使用静态方法now()创建当前本地日期时间对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        //使用静态方法of()创建给定的本地日期时间对象
        LocalDateTime time = LocalDateTime.of(2020, 3,
                25, 13, 45,
                58,998);
        System.out.println(time);
        //调用实例方法getDayOfYear()获取年中天
        int dayOfYear = ldt.getDayOfYear();
        System.out.println(dayOfYear);
        //调用实例方法getDayOfWeek()获取该实例的周中天,返回的是一个枚举对象
        DayOfWeek dayOfWeek = ldt.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(ldt.getMonth());
        ldt = ldt.withDayOfMonth(12).withMonth(3).withYear(2022);
        System.out.println(ldt);
        LocalDateTime localDateTime = ldt.plusDays(123).plusMonths(2).plusYears(1);
        System.out.println(localDateTime);
        localDateTime = localDateTime.minusDays(123).minusMonths(2).minusYears(1);
        System.out.println(localDateTime);
    }
}
