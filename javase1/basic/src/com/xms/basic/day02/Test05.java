package com.xms.basic.day02;

import java.util.Scanner;


public class Test05 {
	public static void main(String[] args) {
		//求1000以内的完数
//		{
//			int sum = 0;
//			for(int i=1;i<1000;i++){
//				sum = 0;
//				for(int j=1;j<i;j++){
//					if(i%j==0){
//						sum+=j;
//					}
//			   }
//				if(i==sum)
//					System.out.println(i);
//			}
//		}
		//求任意键入两个数的最大公约数和最小公倍数
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入第一个数字:");
			int m = sc.nextInt();
			System.out.println("请输入第二个数字:");
			int n = sc.nextInt();
			int cd = commonDivisor(m,n);//最大公约数
			int cm = m*n/cd;
			System.out.println("最大公约数:"+cd+",最小公倍数:"+cm);
			sc.close();
		}
	}
	//使用辗转相减法求公约数
	static int commonDivisor(int num1,int num2) {
		while(num1!=num2) {
			if(num1>num2)
				num1-=num2;
			else
				num2-=num1;
		}
		return num1;
	}
	
}
