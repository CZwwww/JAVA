package com.xms.day04;

interface If{
	
}
public class FatherClass {
	int n1 = 100;
	int n2 = 200;
	public static void main(String[] args) {
		new FatherClass().show();
	}
	public FatherClass() {
		System.out.println("Father");
	
	}
	public void show() {
		int n2 = 20;//这里的n2 是常量,jdk1.8以后可以省略final关键字
		/*
		 * 分析:如果n2是变量,它的生命周期与show()方法相同,但对象创建后,fun()方法中
		 * 调用了n2,这时候可能show()方法调用结束了,n2就不存在了,这时候调用会出错,
		 * 只有n2作为常量才不会出错,常量一旦定义好后会一直存在,除非程序结束
		 * 
		 */
		class InnerClass{
			public 
			void fun() {
				System.out.println(n1);
				System.out.println(n2);
			}
		}
		InnerClass ic = new InnerClass();
		ic.fun();
	}
	public void newInstanc() {
		
	}
}
