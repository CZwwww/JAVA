package com.xms.basic.day02;
/*
 * 循环组成
 * 1)初始化语句(定义循环变量初值)
 * 2)循环条件(定义循环变量的范围)
 * 3)步进语句(控制循环变量的取值)
 * 4)循环操作(循环体)
 */
public class LoopDemo {
	public static void main(String[] args) {
		//打印输出
		for(int i=0;i<10;i++) {
			System.out.println("hello world");
		}
		int num = 0;
//		while(num<10) {
//			System.out.println("helloworld");			
//			num++;
//		}
		num = 0;
		do {
			System.out.println("helloworld");
			num++;
		}while(num<10);
		int k = 1;
		while(k++<20) {
			System.out.println("java");
			k++;
			System.out.println(k-2);
		}
	}
}
