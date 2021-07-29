package com.xms.jdk8;

import java.time.*;

/**
 * @author czw
 * @create 2021-06-28-上午 9:19
 */
public class InsatntDemo {
    public static void main(String[] args) {
        Instant i1 = Instant.now();

        Instant i = Instant.ofEpochSecond(0);
        OffsetDateTime offsetDateTime = i1.atOffset(ZoneOffset.MAX);
        System.out.println(offsetDateTime);
        System.out.println(i1);
        System.out.println(LocalDateTime.ofInstant(i, ZoneId.systemDefault()));
    }
}
