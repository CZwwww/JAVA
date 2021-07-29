package com.xms.singleton;
//懒汉式
public class Student {
	private static Student stu;
	public synchronized static Student getInstance() {
		if(stu!=null) {
			return stu;
		}
		return stu=new Student();
	}
}
