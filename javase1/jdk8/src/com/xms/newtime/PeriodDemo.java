package com.xms.newtime;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author czw
 * @create 2021-06-29-下午 5:29
 */
public class PeriodDemo {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2020,10,11);
        LocalDate ld1= LocalDate.of(2021,10,11);
        //        Duration d = Duration.between(ld,ld1);//不能用于date只能用于datetime或time
//        System.out.println(d.toDays());//java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds
        Period p = Period.between(ld,ld1);//date专用
        System.out.println(p.getDays());
        System.out.println(p.getYears());
        System.out.println(p.getMonths());
        Period period = p.withYears(12).withMonths(12).withDays(12);
        System.out.println(period);
    }
}
