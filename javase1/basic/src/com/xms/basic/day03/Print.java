package com.xms.basic.day03;

public class Print {
	public static void main(String[] args) {
		for(int i=0;i<11;i++) {
			for(int j=0;j<11;j++) {
				System.out.print("["+i+"]"+"["+j+"]"+'\t');
			}
			System.out.println();
		}
	}
}
