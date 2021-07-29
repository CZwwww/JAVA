package com.xms.day02;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author czw
 * @create 2021-06-17-上午 10:26
 */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("IO\\iofile\\1.txt");
        byte[] bArr = new byte[1024];
        fis.read(bArr);
        System.out.println(new String(bArr,"UTF-8"));
        fis.close();
    }
}
