package com.xms.day01;

import java.io.File;

/**
 * @author czw
 * @create 2021-06-16-下午 4:56
 */
public class FileDemo07 {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Administrator\\Desktop\\a");
        //pathname 被查找的file对象

    }
    public static void show(File folder){
        File[] files = folder.listFiles(pathname -> pathname.isDirectory() || pathname.getName().endsWith(".java"));
        for (File file : files) {
            if(file.isDirectory()){
                show(file);
            }
            System.out.println(file.getAbsolutePath());
        }
    }
}
