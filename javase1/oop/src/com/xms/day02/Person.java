package com.xms.day02;

import java.util.Date;

/**
 * 	编程9：
	写一个人的类
	属性：名字，性别，年龄；提供无参的构造器和一个有参的构造器
	方法：（1自我介绍的方法（2吃饭的方法
	创建一个对象“张三”
 * @author Administrator
 *
 */
public class Person {
	private String name;
	private String sex;
	private String id;
	private int age;
	private String address;
	private String telephone;
	private String email;
	private String motherLand;
	private Date birthDay;
	Person(){
		
	}
	
	
	
	public Person(String name, String sex, String id, int age, String address, String telephone, String email,
			String motherLand, Date birthDay) {
		super();
		this.name = name;
		this.sex = sex;
		this.id = id;
		this.age = age;
		this.address = address;
		this.telephone = telephone;
		this.email = email;
		this.motherLand = motherLand;
		this.birthDay = birthDay;
	}



	void show() {
		System.out.println("name:"+name+",sex:"+sex+",age:"+age);
	}
	void eat() {
		System.out.println(name+"吃东西");
	}
	public void setDuty(String duty) {
		
	}
	public String getDuty() {
		return null;
	}
	public void setDegree(String Degree) {
		
	}
	public String getDegree() {
		return null;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id:"+id+",姓名:"+name+",户籍:"+motherLand;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p = (Person) obj;
		return this.id==p.getId()&&this.name==p.getName();
	}
	public static void say() {
		System.out.println("hello");
	}
	
}
