package com.xms.day01;

import com.xms.day02.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("zs");
		s.setAge(-11);
		System.out.println(s.getName()+","+
		s.getAge());
	}
	
}
