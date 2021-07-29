package com.xms.pattern.singleton;
/*
 * 单例模式:
 *  指类的实例在内存中有且只有一个
 */
public class Student {
	private static Student stu = new Student();
	private Student(){
		
	}
	public static Student getInstance() {
		return stu;
	}
}
