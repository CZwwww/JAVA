package com.xms.day04.Vehicles;

public class VehiclesTest {
	public static void main(String[] args) {
		Person p = new Person("唐僧");
		River r = new River();
		p.move("c");
		p.move(r);
		p.move("c");
	}
}
