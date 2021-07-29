package com.xms.day04.Vehicles;

public class Person {
	String name;
	String vehicles = "Horse";
	Vehicles v ;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name) {
		this.name = name;
	}
	public void throughRiver(Object obj) {
		if(obj instanceof River)
			vehicles = "Boat";
		else 
			vehicles = "Horse";
		v =  Factory.getInstance(vehicles).getInstance();
		
	}
	public void move(Object obj) {
		throughRiver(obj);
		v.work();
	}
}