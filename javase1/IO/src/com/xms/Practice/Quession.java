package com.xms.Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * ．使用输入流读取试题文件，每次显示试题文件中的一道题目。
 * 读取到字符“*”时暂停读取，等待用户从键盘输入答案。用户做完全部题目后。程序给出用户的得分。
 * @author czw
 * @create 2021-06-23-下午 8:14
 */
public class Quession {
    public static final int QUESSION_LENGTH = 4;
    public static void main(String[] args) throws IOException {
        printTitle();
    }

    private static void printTitle() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("IO\\iofile\\1.txt"));
        Scanner scan = new Scanner(System.in);
        String[] answer = new String[QUESSION_LENGTH];
        String[] StdAnswer = new String[]{"A","C","C","D"};

        int num = 0;
        while(true){
            String s = br.readLine();
            if("*".equals(s.charAt(0)+"")){
                String next;
                System.out.println("请输入你的答案(A,B,C,D):");
                next = scan.nextLine();
                answer[num] = next;
                num++;
            }else{
                System.out.println(s);
            }

            if(num==4){
                break;
            }
        }
        int count = 0;
        for(int i=0;i<StdAnswer.length;i++){
            if(StdAnswer[i].equalsIgnoreCase(answer[i])){
                count++;
            }
        }
        System.out.println("您的分数是:"+count*5);
    }
}
