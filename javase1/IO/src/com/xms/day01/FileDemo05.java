package com.xms.day01;

import java.io.File;

/**
 * @author czw
 * @create 2021-06-16-下午 3:55
 */
public class FileDemo05 {
    static int count =0;
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Administrator\\eclipse-workspace\\javase1");
        System.out.println(find(f));
//        String str = "dwadsad.java";
//        boolean b = str.matches("\\w*\\.java");
//        System.out.println(b);
    }

    private static int find(File f) {
        if(f.isFile()&&f.getName().matches("\\w*\\.java")){
            System.out.println(f.getAbsolutePath());
            count++;
        }else if(f.isDirectory()){
            File[] arr = f.listFiles();
            for(int i = 0;i<arr.length;i++){
                find(arr[i]);
            }
        }
        return count;
    }
}
