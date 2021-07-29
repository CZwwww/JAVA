package com.xms.day01;

import java.io.File;
import java.util.Arrays;

/**
 * @author czw
 * @create 2021-06-16-下午 4:35
 */
public class FileDemo06 {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Administrator\\Desktop\\a");
        //1)通过文件名称过滤器获取文件和目录的名称
        String[] list = folder.list((dir, name) -> new File(dir, name).isFile() && new File(dir, name).getName().endsWith(".txt"));
        System.out.println(Arrays.toString(list));
    }
}
