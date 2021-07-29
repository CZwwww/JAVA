package com.xms.basic.day01;

public class Demo02 {
	public static void main(String[] args) {
		//声明变量并初始化
		int a = 0;
		System.out.println(a);
		//变量重新设值
		a=Integer.SIZE ;
		System.out.println(a);
		{
			int age =0;
			System.out.println(age);
		}
//		System.out.println(age);变量只在声明的作用域有效,超出作用域自动销毁
		//作用域,变量所在的大括号内
		int age = 0;
		System.out.println(age);
		int b = 1;
//		int b = 2;在同一作用域内变量不可以多次
	}
}
