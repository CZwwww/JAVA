package com.xms.day04;

import java.io.*;

/**
 * @author czw
 * @create 2021-06-18-上午 10:12
 */
public class StreamDemo02 {
    public static void main(String[] args) throws IOException {
        StreamDemo02.demo();
        demo02();
    }

    private static void demo() throws IOException {
        //数据输出流
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("IO\\iofile\\data.txt")));
        //写入一个int数据(实际上是写入一个长度为4的字节数组)
        dos.writeInt(1000);
//        dos.writeChar('a');
//        dos.writeBytes("abcde");
//        dos.writeChars("abcde");
        //先写入两个字节表示字符串长度,后写入字符串
        dos.writeUTF("abcde");
        dos.close();
    }
    private static void demo02() throws IOException{
        DataInputStream dis = new DataInputStream(new FileInputStream("IO\\iofile\\data.txt"));
        System.out.println(dis.readInt());
        System.out.println(dis.readUTF());
    }
}
