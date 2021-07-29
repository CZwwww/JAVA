package com.xms.day02;
		
public class EmployeeTest {
	public static void main(String[] args) {
		Person p1 = new Staff();
		Person p2 = new Faculty();
		System.out.println(p2 instanceof Faculty);
		p1.setDuty("职员");
		
		Employee e = ((Employee)p2);//向下转型只能父子关系
		Faculty f = (Faculty)e;
//		f.equals(obj);
		System.out.println(p1.getDuty());
		System.out.println(p2.getDegree());
		System.out.println(p2.getName());
	
	}
}
