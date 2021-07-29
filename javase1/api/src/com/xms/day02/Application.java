package com.xms.day02;

import java.util.Scanner;

/**
 * @author czw
 * @create 2021-06-08-下午 8:13
 */
public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        char first = string.charAt(0);
        int count = 0;
        if(compare(first)){
            for(int i=0;i<string.length();i++){
                if(compare(string.charAt(i))) {
                    count++;
                    System.out.println(string.charAt(i));
                }
            }
        }else{
            System.out.println("第一个字母不是大写字母");
        }
    }
    public static boolean compare(char c){//
        return c<='Z'&&c>='A';
    }
}
