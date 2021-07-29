package com.xms.basic.day02;

public class OperatorDemo04 {
	public static void main(String[] args) {
		int a = 3;//将1赋值给int类型变量a
		a+=2;
		a-=3;
		a*=4;
		a/=5;
		System.out.println(a);
		short s = 1;
		s = (short)(s+3);//等价于 s+=3;
	}
}
