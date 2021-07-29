package com.xms.basic.day03;

import java.util.Random;
import java.util.Scanner;

/**
 * 打印自然数的个数
1打印1~100之间 6的倍数的个数

2求出1～100之间，既是3又是7的倍数的自然数出现的次数？
求调和级数中从第多少项开始值大于10 1+ 1/2+1/3+1/4+1/5+.....+1/n
 * @author Administrator
 *
 */
public class Test06 {
	public static void main(String[] args) {
//		int[] count = new int[2];//计数器
//		for(int i = 1;i<101;i++) {
//			if(i%6==0)
//				count[0]++;
//			if(i%3==0&&i%7==0)
//				count[1]++;
//		}
//		System.out.println("1~100之间6的倍数的个数为:"+count[0]);
//		System.out.println("1～100之间，既是3又是7的倍数出现的次数:"+count[1]);
	//	System.out.println("-----------------");
		//求调和级数
//		double num = 2;
//		double num1 = 1;
//		int  count =0;
//		for(;;) {
//			num1 +=(1.0/num);
//			num++;
//			count++;
//			
//			if(num1>10)
//				break;
//		}
//		System.out.println(count-1);
//		
		
		Random rand = new Random();
		int num= rand.nextInt(100);
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int count = 0;
		while(true){
			num1 = sc.nextInt();
			count++;
			if(num1==num){
				System.out.println("恭喜你答对了,你答了"+count+"次");
				break;
			}else if(num1<num){
				System.out.println("小了");
			}else if(num1>num){
				System.out.println("大了");
			}
		}
		sc.close();
	}
}
