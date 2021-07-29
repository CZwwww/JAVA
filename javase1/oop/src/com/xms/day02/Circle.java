package com.xms.day02;

/**
 * 编程6：
定义一个圆形类
提供显示圆周长功能的方法
提供显示圆面积的方法
提供无参的构造器和一个有参的构造器



 * @author Administrator
 *
 */
public class Circle {
	Point center;
	double radius;
	Circle(){
		
	}
	Circle(double radius,Point center){
		this.center = center;
		this.radius = radius;
	}
	double getPerimeter() {
		return 2*Math.PI*radius;
	}
	double getArea() {
		return Math.PI*radius*radius;
	}
}
