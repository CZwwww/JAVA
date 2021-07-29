package com.xms.day04.animal;

public class Dog implements Animal{

	@Override
	public void respirations() {
		// TODO Auto-generated method stub
		System.out.println("小狗呼吸");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("小狗跑");
	}

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("汪汪");
	}

}
