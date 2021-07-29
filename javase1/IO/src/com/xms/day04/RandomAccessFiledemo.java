package com.xms.day04;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author czw
 * @create 2021-06-18-下午 2:12
 */
public class RandomAccessFiledemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("IO\\iofile\\Random.txt","rw");
        raf.writeByte(97);
        raf.writeInt(100);
        long p =raf.getFilePointer();
        raf.writeUTF("hello");
        raf.seek(0);
        int by = raf.read();
        System.out.println(by);
        int a = raf.readInt();
        System.out.println(a);
        String str = raf.readUTF();
        System.out.println(str);
        raf.seek(p);
        String str1 = raf.readUTF();
        System.out.println(str1);
        raf.close();
    }
}
