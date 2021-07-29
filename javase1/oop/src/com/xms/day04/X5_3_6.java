package com.xms.day04;

import com.xms.day04.circle.Circle;
import com.xms.day04.cylinder.Cylinder;
import com.xms.day04.shape.Shape;

/**
 * （4）X5_3_6.java文件，在该文件中定义主类X5_3_6，该类在默认包中，
 * 其中包含主方法main()，在主方法中创建两个圆类对象cir1和cir2，具体尺寸自己确定，
 * 并显示圆的面积和周长；再创建两个圆柱体类的对象cy1和cy2，具体尺寸自己确定，
 * 然后分别显示圆柱体cy1和cy2的底圆的面积和周长以及它们各自的体积和表面积。
【编程分析】本题主要考察接口、包、继承、封装等问题
 * @author Administrator
 *
 */
public class X5_3_6 {
	public static void main(String[] args) {
		Shape cir1 = new Circle(3);
		Shape cir2 = new Circle(5);
		Shape cy1 = new Cylinder(3,6);
		Shape cy2 = new Cylinder(4,5);
		System.out.println(cir1.getArea());
		System.out.println(cy1.getArea());
		Cylinder cy3 = (Cylinder)cy2;
		System.out.println(cy3.getValume());
	}
}
