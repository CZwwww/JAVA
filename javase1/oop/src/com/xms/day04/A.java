package com.xms.day04;


public class A {
	static void run(){
		class B{
			static final String NAME = "B";
			void show() {
				System.out.println(NAME);
			}
		}
		B b = new B();
		b.show();
	}
	public static void main(String[] args) {
		A.run();
	}
}
