package com.xms.basic.day02;

public class OperatorDemo06 {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		System.out.println(a<<b);//a<<b==a*2^b
		
		System.out.println(-10>>2);//-3
		//10000000 00000000 00000000 00000000 00001010
		//11111111 11111111 11111111 11111111 11110101
		//11111111 11111111 11111111 11111111 11110110
		//11111111 11111111 11111111 11111111 11111101 >>2
		//11111111 11111111 11111111 11111111 11111100
		//10000000 00000000 00000000 00000000 00000011
		System.out.println(-10>>>2);
		//10000000 00000000 00000000 00000000 00001010
		//11111111 11111111 11111111 11111111 11110101
		//11111111 11111111 11111111 11111111 11110110
		//00111111 11111111 11111111 11111111 11111101 >>>2
		//00111111 11111111 11111111 11111111 11111100
		
		//位与
		System.out.println(3&5);
		//位或
		System.out.println(3|5);
		//取反
		System.out.println(~2);
		
		int x=0,y=1;
		if(++x==y-- & x++==1||--y==0)
		System.out.println("x="+x+",y="+y);   
		else
			        System.out.println("y="+y+",x="+x);
	}
}
