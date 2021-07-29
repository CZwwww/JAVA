package com.xms.newtime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * @author czw
 * @create 2021-06-29-下午 4:52
 */
public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        //通过指定日期时间创建
        LocalDateTime localDateTime = LocalDateTime.of(2021,6,29,16,55,10,25);
        System.out.println(localDateTime);
        Month month = localDateTime.getMonth();
        System.out.println(month);
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        int dayOfYear = localDateTime.getDayOfYear();
        int year = localDateTime.getYear();
        int monthValue = localDateTime.getMonthValue();
        System.out.println(dayOfYear);
        System.out.println(dayOfWeek);
        System.out.println(year);
        System.out.println(monthValue);
        LocalDateTime localDateTime1 = localDateTime.plusYears(2);
        System.out.println(localDateTime1.getYear());
        System.out.println(localDateTime1.minusMonths(2));
    }
}
