package com.xms.day02;

public class Wife {
	String name;
	int age;
	Husband husband;
	void getInfo() {
		System.out.println("name:"+name+"age"+age+",wife:["+
						"name:"+husband.name+",age:"+husband.age+"]");
		
	}
}
