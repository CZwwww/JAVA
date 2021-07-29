package com.xms.day02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author czw
 * @create 2021-06-17-下午 4:15
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        String src = "D:\\1.txt";
        String dest = "IO\\iofile\\5.txt";
        copy(src,dest);
    }

    private static void copy(String src, String dest) throws IOException {
        FileReader fr = new FileReader(src);
        FileWriter fw = new FileWriter(dest);
        int len = -1;
        char[] buf = new char[1024];
        while((len = fr.read(buf))!=-1){
            fw.write(buf,0,len);
        }
    }
}
