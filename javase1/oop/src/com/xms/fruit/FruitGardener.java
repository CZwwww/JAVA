package com.xms.fruit;

public class FruitGardener {
	public Fruit getFruit(String name){
		if("苹果".equals(name)) {
			return (Fruit) new Apple();
		}
		if("葡萄".equals(name)) {
			return (Fruit) new Grape();
		}
		if("草莓".equals(name)) {
			return (Fruit) new Stuawberry();
		}
		return null;
	}
}
