package com.xms.day02;

/**\
 * 编程11：
写一个课程类：
属性：课程名；学时；任课老师；
创建五个对象：“c语言”，“java编程”，“php网络编程”，“c++”，“数据结构”
提供无参的构造器和一个有参的构造器

 * @author Administrator
 *
 */
public class Course {
	String name;
	Person teacher;
	int hours;
	Course(){
		
	}
	Course(String name,Person teacher,int hours){
		this.name = name;
		this.teacher = teacher;
		this.hours = hours;
	}
}
