package com.xms.day02;
/**
 * 
编程7：
设计一个Dog类，名字、颜色和年龄属性，定义构造器初始化这些属性，定义输出方法show()显示其信息。
提供无参的构造器和一个有参的构造器






 * @author Administrator
 *
 */


public class Dog extends Animal {
	Dog(){
		
	}
	Dog(String name,String color,int age){
		super(name ,color, age);
	}
	void show() {
		System.out.println("name:"+super.getName()+",color:"+super.getColor()+",age:"+super.getAge());
	}
}
