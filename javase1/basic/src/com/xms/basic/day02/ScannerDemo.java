package com.xms.basic.day02;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字,以enter确认:");
		int a = sc.nextInt();//阻塞方法
		System.out.println(a);
	}
}
