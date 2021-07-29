package com.xms.day04;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author czw
 * @create 2021-06-18-上午 11:07
 */
public class StreamDemo03 {
    public static void main(String[] args) throws IOException {
        demo();
    }
    private static void demo() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write("hello".getBytes());
        System.out.println(baos);
    }
}
