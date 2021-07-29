package com.xms.day02;

public class duotaiDemo{
	public static void main(String[] args) {
		KZD kd = new KZ();
	}
}
class KZD {
	String name = "孔子爹";
	public void teach() {
		System.out.println("如何教育下一代");
	}
}
class KZ extends KZD{
	String name = "孔子";
	public void teach() {
		System.out.println("如何吃鸡");
	}
}
