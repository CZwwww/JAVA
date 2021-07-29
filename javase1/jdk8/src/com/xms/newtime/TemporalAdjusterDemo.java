package com.xms.newtime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

/**
 * @author czw
 * @create 2021-06-29-下午 5:34
 */
public class TemporalAdjusterDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime ldt = now.withDayOfMonth(20);
        System.out.println(ldt);
        //with(TemporalAdjuster temporalAdjuster)
        LocalDateTime ldt2 = ldt.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(ldt2);
        //2)设置下一个周几
        LocalDateTime ldt3 = now.with(TemporalAdjusters.next(DayOfWeek.of(5)));
        System.out.println(ldt3);
        now.with((t)->{
            LocalDateTime t1 = (LocalDateTime) t;
            DayOfWeek dayOfWeek = t1.getDayOfWeek();
            if(dayOfWeek==DayOfWeek.FRIDAY){
                return t1.plusDays(3);
            }else if(dayOfWeek==DayOfWeek.SATURDAY){
                return t1.plusDays(2);
            }else{
                return t1.plusDays(1);
            }
        });
    }
}
