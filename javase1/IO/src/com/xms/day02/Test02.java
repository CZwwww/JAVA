package com.xms.day02;

import java.io.*;

/**
 * @author czw
 * @create 2021-06-17-上午 11:49
 */
public class Test02 {
    public static void main(String[] args) {
        String src = "D:\\paint.png";
        String dest = "C:\\Users\\Administrator\\Desktop\\paint.png";
        long t1 = 0;
        long t2 = 0;
        try {
            t1 = getSubTime(src, dest, Test02::copy);
            t2 = getSubTime(src, dest, Test02::copy1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(t1);
        System.out.println(t2);
    }
    private static void copy(String src,String dest) throws IOException {
        byte[] bArr = new byte[256];
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest,true);
        int len = -1;
        while ((len =fis.read(bArr))!=-1) {
            fos.write(bArr,0,len);
        }
        fis.close();
        fos.close();
    }
    private static long getSubTime(String src,String dest,Test t) throws IOException {
        long begin = System.currentTimeMillis();
        t.test(src,dest);
        long over = System.currentTimeMillis();
        return over-begin;
    }
    private static void copy1(String src,String dest) throws IOException {
        byte[] bArr = new byte[256];
        FileInputStream fis = new FileInputStream(src);
        BufferedInputStream bis= new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream(dest,true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int len = -1;
        while ((len =bis.read(bArr))!=-1) {
            bos.write(bArr,0,len);
        }
        fis.close();
        fos.close();
    }
}
interface Test{
    void test(String src,String dest) throws IOException;
}
