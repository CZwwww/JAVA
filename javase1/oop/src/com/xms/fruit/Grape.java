package com.xms.fruit;

public class Grape implements Fruit{

	@Override
	public void grow() {
		// TODO Auto-generated method stub
		System.out.println("葡萄在生长");
	}

	@Override
	public void havest() {
		// TODO Auto-generated method stub
		System.out.println("收获葡萄");
	}

	@Override
	public void plant() {
		// TODO Auto-generated method stub
		System.out.println("种植葡萄");
	}

}
