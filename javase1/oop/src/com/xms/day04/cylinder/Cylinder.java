package com.xms.day04.cylinder;

import com.xms.day04.circle.Circle;
import com.xms.day04.shape.Shape;

public class Cylinder extends Circle implements Shape{
	private double height;
	public Cylinder() {
		// TODO Auto-generated constructor stub
	}
	
	public Cylinder(double radius,double height) {
		super(radius);
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return super.getArea()*2+2*PI*getRadius()*height;
	}
	public double getValume() {
		return super.getArea()*height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
}
