package com.xms.day02;

import java.io.*;

/**
 * @author czw
 * @create 2021-06-17-下午 4:34
 */
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        copy(new File("C:\\Users\\Administrator\\Desktop\\demo"),new File("D:\\demo"));

    }
    private static void copy(File src,File dest) throws IOException {
        if(src.isDirectory()){
            File[] arr = src.listFiles();
            dest.mkdirs();
            for (File file : arr) {
                copy(file,new File(dest,file.getName()));
            }
        }else{
            copyInner(src,dest);
        }
    }
    private static void copyInner(File src,File dest) throws IOException {
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
}
