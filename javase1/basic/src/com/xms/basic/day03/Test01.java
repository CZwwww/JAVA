package com.xms.basic.day03;

public class Test01 {
	public static void main(String[] args) {
		//图形
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				if(j>=3)
//				break;
//				System.out.print("*");			
//			}		
//			System.out.println();
//		}
//		
//		//99乘法
//		for(int i=1;i<=9;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+"*"+i+"="+j*i+'\t');
//			}
//			System.out.println();
//		}
		
		for(int i=100;i<1000;i++) {
			int sum = 0;
			int num = i;
			for(int j=0;j<3;j++) {
				sum += (num%10)*(num%10)*(num%10);
				num/=10;
			}
			if(sum==i) 
			System.out.println(sum);
		}
	}
}
