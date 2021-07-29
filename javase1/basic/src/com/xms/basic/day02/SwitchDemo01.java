package com.xms.basic.day02;

public class SwitchDemo01 {
	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		switch(a/b) {
		case 0 :System.out.println("a");
			break;
		case 1 :System.out.println("b");
			break;
		case 2 :System.out.println("c");//省略break会导致case穿透
			break;
		case 3 :System.out.println("d");
			break;
		case 4 :System.out.println("e");
			break;
		default :System.out.println("f");
			break;
		}
	}
}
