package com.xms.basic.day02;

//import java.util.Random;
import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] num = new int[3];
//		for(int i=0;i<num.length;i++) {
//			System.out.println("Please enter an number");
//			num[i] = sc.nextInt();
//		}
//		System.out.println("MaxNumber:"+ (num[0]>num[1]?num[0]>num[2]?num[0]:num[2]:num[1]>num[2]?num[1]:num[2]));
//	
		
//		Scanner sc = new Scanner(System.in);
//		int height = 0;
//		int weight = 0;
//		while(true) {
//			System.out.println("请输入身高:");
//			height = sc.nextInt();
//			if(height>999) {
//				System.out.println("欢迎下次使用");
//				break;
//			}
//			System.out.println("请输入体重");
//			weight = sc.nextInt();
//			int stdWeight = (height-108)*2;
//			if(weight<=(stdWeight+10)&&weight>=(stdWeight-10));
//				System.out.println("测试者体重合适");
//			System.out.println("如要退出程序,请输入大于999的身高");
//		}
//		sc.close();
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int p = (a+b+c)/2;
		boolean isTri = false;
		isTri = a+b>c?true:(a+c>b?true:(b+c>a?true:false));
		if(isTri) {
			System.out.println("能创建三角形");
			if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a) {
				System.out.println("该三角形是直角三角形");
			}else if(a==b||b==c||a==c) {
				System.out.println("该三角形是等腰三角形");
			}else {
				System.out.println("该三角形是普通三角形");
			}
			System.out.println("该三角形的面积为:"+Math.sqrt(p*(p-a)*(p-b)*(p-c)));
		}else {
			System.out.println("不能创建三角形");
		}
		sc.close();
	}
}
