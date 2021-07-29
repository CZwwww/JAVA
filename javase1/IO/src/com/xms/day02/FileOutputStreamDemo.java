package com.xms.day02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author czw
 * @create 2021-06-17-上午 10:00
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        /*
        如果文件不存在,执行构造的时候会创建文件,如果文件所在目录不存在,这时候会发生FileNotFoundException
         */
        File file = new File("io\\iofile\\1.txt");
        FileOutputStream fos = new FileOutputStream(file,true);
        fos.write("AVD".getBytes());
        fos.close();
        FileOutputStream fos2 = new FileOutputStream(file,true);

        fos2.write("我爱java".getBytes());
        fos2.close();
        String dest = "test.txt";
        FileOutputStream fos1 = new FileOutputStream(dest);
        fos1.write("Java是一种可以撰写跨平台应用软件的面向对象的程序设计语言，是由Sun Microsystems公司于 1995年5月推出的Java程序设计语言和Java平台（即JavaSE, JavaEE, JavaME）的总称。Java 技术具有 卓越的通用性、高效性、平台移植性和安全性，广泛应用于个人PC、数据中心、游戏控制台、科 学超级计算机、移动电话和互联网，同时拥有全球最大的开发者专业社群。在全球云计算和移动互 联网的产业环境下，Java更具备了显著优势和广阔前景。".getBytes());
        fos1.close();
        String src = "test.txt";
        FileReader fr = new FileReader(src);
        int ch = -1;
        while((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }
        fr.close();
    }
}
