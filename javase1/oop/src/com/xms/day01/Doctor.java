package com.xms.day01;

public class Doctor {
	private String name;
	private int age;
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
	public void eat() {
		System.out.println("吃");
	}
	public void showInfo() {
		System.out.println("name:"+getName()+",age:"+getAge());
	}
}
