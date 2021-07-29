package com.xms.day04.circle;

import com.xms.day04.shape.Shape;

public class Circle implements Shape{
	private double radius;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return PI*radius*radius;
	}
	public double getPerimeter() {
		return 2*PI*radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
