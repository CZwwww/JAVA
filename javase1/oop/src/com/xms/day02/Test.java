package com.xms.day02;

public class Test {
		public static void main(String[] args) {
			 Vehicle v = new Vehicle(4,3000);
			 Vehicle c = new Car(v.getWheels(),v.getWeight(),4);
			 Vehicle t = new Truck(c.getWheels(),c.getWeight(),c.getLoader(),600);
			 System.out.println(v.toString());
			 System.out.println(c.toString());
			 System.out.println(t.toString());
		}
	}
