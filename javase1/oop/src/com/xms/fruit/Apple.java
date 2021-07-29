package com.xms.fruit;

public class Apple implements Fruit{

	@Override
	public void grow() {
		// TODO Auto-generated method stub
		System.out.println("苹果在生长");
	}

	@Override
	public void havest() {
		// TODO Auto-generated method stub
		System.out.println("收获苹果");
	}

	@Override
	public void plant() {
		// TODO Auto-generated method stub
		System.out.println("种植苹果");
	}

}
