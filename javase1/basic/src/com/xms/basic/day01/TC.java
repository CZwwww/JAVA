package com.xms.basic.day01;

class TC {
	public static void main(String[] args) {
		Circle cir1 = new Circle(4.0);
		Circle cir2 = new Circle(25.0);
		Circle cir;
		cir = cir1.compare(cir2);
		if (cir1 == cir)
			System.out.println("圆1的半径比较大");
		else
			System.out.println("圆2的半径比较大");
	}
}