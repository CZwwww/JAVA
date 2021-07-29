package com.xms.newtime;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * @author czw
 * @create 2021-06-29-下午 5:05
 */
public class InstantDemo {
    public static void main(String[] args) {
        //获取当前时间戳
        Instant instant = Instant.now();
        System.out.println(instant);
        //通过指定毫秒值创建时间戳
        Instant instant1 = Instant.ofEpochMilli(1000);
        System.out.println(instant1);
        System.out.println(instant1.toEpochMilli());
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
    }
}
