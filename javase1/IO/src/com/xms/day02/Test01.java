package com.xms.day02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author czw
 * @create 2021-06-17-上午 11:10
 */
public class Test01 {
    public static void main(String[] args) {
        String src = "D:\\paint.png";
        String dest = "C:\\Users\\Administrator\\Desktop\\paint.png";
        try {
            Copy(src,dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void Copy(String src,String dest) throws IOException{
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
