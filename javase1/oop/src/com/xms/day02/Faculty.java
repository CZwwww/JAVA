package com.xms.day02;

public class Faculty extends Employee{
	String degree;
	String level;

	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	
	@Override
	public Faculty getInstance() {//返回类型是被覆盖方法返回类型的子类
		// TODO Auto-generated method stub
		return new Faculty();
	}
	public static void say() {
		System.out.println("speak");
	}
}
