package com.xms.basic.day02;

public class IfDemo01 {
	public static void main(String[] args) {
		int age = 21;
		if(age<18)
		{
			
			}
		
		if(age>23) {
			
		}else {
			
		}
		
		if(age>=0&&age<=3) {
			System.out.println("在家玩");
		}else if(age>=4&&age<=6){
			System.out.println("幼儿园");
		}else if(age>=7&&age<=22) {
			System.out.println("上学");
		}else if(age>=23&&age<=65) {
			System.out.println("上班");
		}
		
		if(age>18) 
			if(age>22)
				System.out.println("hello");
		else 
			if(age>5)
				System.out.println("world");
			else
				System.out.println("java");
			
		}
	}

