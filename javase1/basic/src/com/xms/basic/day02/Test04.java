package com.xms.basic.day02;
/*
 * 1)求1~100所有偶数和
 * 2)求5!
 * 3)输出所有水仙花数
 */
public class Test04 {
	public static void main(String[] args) {
//		int sum = 0;
//		for(int i=2;i<=100;i+=2) {	
//				sum	+=i;
//		}
//		System.out.println(sum);
//		int num=2;
//		sum = 0;
//		while(num<=100) {
//			sum+=num;
//			num+=2;				
//		}
//		System.out.println(sum);
//		num = 2;
//		sum = 0;
//		do {
//			sum+=num;
//			num+=2;
//		}while(num<=100);
//		System.out.println(sum);
//		
//		System.out.println("-----------");
//		num = 1;
//		for(int i=2;i<6;i++) {
//			num*=i	;		
//		}
//		System.out.println(num);
//		
//		
//		num = 2;
//		sum = 1;
//		while(num<6) {
//			sum*=num;
//			num++;
//		}
//		System.out.println(sum);
//		num = 2;
//		sum = 1;
//		do {
//			sum*=num;
//			num++;
//		}while(num<6);
//		System.out.println(sum);
//		
//		System.out.println("-----------");
//		
//		for(int i=100;i<1000;i++) {
//			int a = i/100;
//			int b = i%100/10;
//			int c = i%10;
//			if(i==v(a)+v(b)+v(c))
//			System.out.println(i);
//		}
//		System.out.println("while");
//		num = 100;
//		while(num<1000) {
//			int a = num/100;
//			int b = num%100/10;
//			int c = num%10;
//			if(num==v(a)+v(b)+v(c))
//			System.out.println(num);
//			num++;
//		}
//		System.out.println("do..while");
//		num = 100;
//		do {
//			int a = num/100;
//			int b = num%100/10;
//			int c = num%10;
//			if(num==v(a)+v(b)+v(c))
//			System.out.println(num);
//			num++;
//		}while(num<1000);

			double num = 1;
			double sum = 0;
			
			int  count =0;
			while(true) {
				sum += (1.0/num);
				num++;
				count++;
				
				if(sum>10)
					break;
			}
			System.out.println(count+1);
		
	}
	static int v(int num) {
		return num*num*num;
	}
	static int[] split(int num) {
		int[] arr = new int[3];
		arr[0] = num/100;
		arr[1] = num%100/10;
		arr[2] = num%10;	
		return arr;
	}
}
