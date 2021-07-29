package com.xms.day01;

import java.io.File;

/**
 * @author czw
 * @create 2021-06-16-下午 3:43
 */
public class FileDemo03 {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Administrator\\Desktop\\a");
        File[] files = folder.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

    }
}
