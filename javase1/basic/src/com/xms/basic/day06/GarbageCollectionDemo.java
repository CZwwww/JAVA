package com.xms.basic.day06;

public class GarbageCollectionDemo{
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<10;i++) {
			MyClass mc = new MyClass();
			System.out.println("第"+i+"次创建对象"+mc);
		}
		System.gc();
		for(int i=0;i<10;i++) {
			Thread.sleep(1);
			System.out.println("程序在继续");
		}
	}
	
	
}
class MyClass{
	public void finalize() {
		System.out.println("下次再见");
	}
}