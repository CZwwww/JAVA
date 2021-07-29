package com.xms.newtime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

/**
 * @author czw
 * @create 2021-06-29-下午 5:18
 */
public class DurationDemo {
    public static void main(String[] args) throws InterruptedException {
        Instant ins = Instant.now();
        Thread.sleep(1000);
        Instant ins1 = Instant.now();
        Duration between = Duration.between(ins, ins1);
        System.out.println(between.getSeconds());
        System.out.println(between.getNano());
        System.out.println(between.toMillis());
        System.out.println(between.toMinutes());

        LocalDate ld = LocalDate.of(2020,10,11);
        LocalDate ld1= LocalDate.of(2021,10,11);
//        Duration d = Duration.between(ld,ld1);//不能用于date只能用于datetime或time
//        System.out.println(d.toDays());//java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds
        Period p = Period.between(ld,ld1);//date专用
    }
}
