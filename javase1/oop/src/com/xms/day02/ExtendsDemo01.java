package com.xms.day02;
class Animal{
	private String name;
	private int age;
	private String color;
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public Animal(String name,String color,int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}
	public void eat() {}
	public void speak() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
class Cat extends Animal{
	
}
public class ExtendsDemo01 {
	public static void main(String[] args) {
		TD.Inner ti = new TD().new Inner();
		ti.show();
	}
}
class TD {
	int y = 6;

	class Inner {
		static final int y = 3;

		void show() {
			System.out.println(y);
		}
	}
}

