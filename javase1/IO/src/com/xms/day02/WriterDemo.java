package com.xms.day02;

import java.io.*;

/**
 * @author czw
 * @create 2021-06-17-下午 2:42
 */
public class WriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw =//字符流不会将数据写入目的端,会先写入缓冲区
                new OutputStreamWriter(
                        new FileOutputStream("IO\\iofile\\4.txt"),
                        "gbk");
        osw.write("abc你好");
        osw.close();

        //流对象在关闭之前会先调用flush方法清空缓冲区数据
    }
}
