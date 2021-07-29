package com.xms.basic.day02;

import java.util.Scanner;

/*
 * 控制台录入成绩(0~100)输出对应等级
 * 
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩:");
		int score = sc.nextInt();
		
//		if(score<0||score>100) {
//			System.out.println("error");
//		}else {
//			if(score>=90) {
//				System.out.println("A");
//			}else if(score>=80) {
//				System.out.println("B");
//			}else if(score>=60) {
//				System.out.println("C");
//			}else {
//				System.out.println("D");
//			}
//		}
		if(score<0||score>100) {
			System.out.println("error");
		}else {
			switch(score/10) {
			case 0 :
			case 1 :
			case 2 :
			case 3 :
			case 4 :
			case 5 :System.out.println("D");
				break;
			case 6 :
			case 7 :System.out.println("C");
				break;
			case 8 :System.out.println("B");
				break;
			case 9 :
			case 10:System.out.println("A");
				break;
			}
		}
		sc.close();
		}
}
