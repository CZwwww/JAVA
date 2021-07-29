package com.xms.fruit;

public class People {
	
	public static void main(String[] args) {
		FruitGardener f = new FruitGardener();
		Fruit f1 = f.getFruit("苹果");
		Fruit f2 = f.getFruit("葡萄");
		f1.grow();
		f2.grow();
	}
}
