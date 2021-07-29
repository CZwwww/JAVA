package com.xms.day01;

import java.io.File;

/**
 * @author czw
 * @create 2021-06-16-下午 3:48
 */
public class FileDemo04 {
    public static void main(String[] args) {
        File file = new File("IO\\iofile\\1.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getParentFile());//file对象
        System.out.println(file.getParent());//String
        System.out.println(file.getName());
        System.out.println(file.length());
    }
}
