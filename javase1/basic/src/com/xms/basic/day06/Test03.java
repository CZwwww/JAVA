package com.xms.basic.day06;

public class Test03 {
	public static void main(String[] args) {
//		System.out.println(sum(6));
		Integer a = Integer.valueOf(2);
		Integer b = Integer.valueOf(1);
		swap(a,b);
		System.out.println(a);
		System.out.println(b);
	}
	static int sum(int n) {
		
		if(n==1) {
			return 1;
		}
		return sum(n-1)+n;
	}
	static void swap(Integer a,Integer b) {
		Integer temp = a;	
		a = b;
		b = temp;
		
	}
}
