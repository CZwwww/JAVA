package com.xms.day02;

import java.util.Scanner;

/**
 * 2.编写一个Java应用程序，从键盘读取用户输入两个字符串，
 * 并重载3个函数分别实现这两个字符串的拼接、整数相加和
 * 浮点数相加。要进行异常处理，对输入的不符合要求的字符
 * 串提示给用户，不能使程序崩溃。
 * @author czw
 * @create 2021-06-09-上午 9:50
 */
public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String str2 = scanner.next();
        String s = operateStr(str,str2,str);
        System.out.println(s);
        int sum = operateStr(str,str2,1);
        System.out.println(sum);
        float sum1 = operateStr(str,str2,1f);
        System.out.println(sum1);


    }
    public static String operateStr(String str1,String str2,String s){
        return str1.concat(str2);
    }
    public static Integer operateStr(String str1,String str2,int i){
        try {
            int a = Integer.parseInt(str1);
            int b = Integer.parseInt(str2);
            return a + b;
        }catch(NumberFormatException nfe){
            System.out.println("输入的字符串不符合要求");
            return 0;
        }
    }
    public static Float operateStr(String str1,String str2,float f) {
        try {
            float a = Float.parseFloat(str1);
            float b = Float.parseFloat(str2);
            return a + b;
        }catch(NumberFormatException nfe){
            System.out.println("输入的字符串不符合要求");
            return 0f;
        }
    }

}
