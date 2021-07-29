package com.xms.day02;
/**
 * 编程1：
编写一个Student类，包含name、gender、age、id、score属性，分别为String、String、int、int、double类型。
类中声明一个say方法，返回String类型，方法返回信息中包含所属性值。
在另一个StudentTest类中的main方法中，创建Student对象，并访问say方法和所属性，并将调用结果打印输出。


 * @author Administrator
 *
 */
public class Student {
	private String name;
	private String gender;
	private int age;
	private int id;
	private double score;
	String say() {
		return "name:"+name+"gender:"+gender+"age:"+age+"id:"+id+"score:"+score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;//java produce
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
}
