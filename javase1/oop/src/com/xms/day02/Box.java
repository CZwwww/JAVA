package com.xms.day02;
/**
 * 编程5：
编程创建一个Box类，在其中定义个变量表示一个立方体的长、宽和高，
定义一个方法求立方体的体积。创建一个对象，求给定尺寸的立方体的体积。
（提供无参的构造器和一个有参的构造器）
 * @author Administrator
 *
 */
public class Box {
	double length;
	double width;
	double height;
	Box(){
		
	}
	Box(double length,double width,double height){
		this.height = height;
		this.width = width;
		this.length = length;
	}
	double getVolume() {
		return length*width*height;
	}
}
