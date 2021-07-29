package com.xms.day02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author czw
 * @create 2021-06-17-下午 3:02
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr =
                new InputStreamReader(
                        new FileInputStream("IO\\iofile\\4.txt"),
                        "gbk");
        char[] arr = new char[16];
        int len = isr.read(arr);
        System.out.println(arr);
        isr.close();


    }
}
