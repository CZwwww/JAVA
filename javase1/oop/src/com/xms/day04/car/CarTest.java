package com.xms.day04.car;

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car(35);
		Car c1 = new Car(-15);
		Car c2 = new Car(45);
		c.getAir().flow();
		c1.getAir().flow();
		c2.getAir().flow();
	}
}
