package com.xms.day02;

/**
 * 声明一个圆柱体类Cylinder
声明属性：底边的半径radius，和高height
声明方法：
1打印圆柱体的详细信息，圆柱体的底边的半径是xxx，高是xxx，底面积是xxx，体积是xxx。
2返回底面积 
3返回体积
4为圆柱体的底边的半径，和高赋值
5为圆柱体的底边的半径，和高赋值，并返回赋值的结果。如果底边的半径或高为<=0，赋值失败，返回false，否则返回true
并测试	
 * @author Administrator
 *
 */
public class Cylinder {
	double radius;
	double height;
	void getInfo() {
		System.out.println("圆柱体的底边的半径:"+radius+",高是:"+height+",底面积是:"+getBottomArea()+",体积是:"+getVolume());
	}
	double getBottomArea() {
		return Math.PI*radius*radius;
	}
	double getVolume() {
		return this.getBottomArea()*height;
	}
	void setRadius(int radius){
		this.radius = radius;
	}
	void setHeight(int height) {
		this.height = height;
	
	}
	boolean setRadius(double radius) {
		if(radius>0) {
			this.radius = radius;
			return true;
		}
		return false;
	}
	boolean setHeight(double height) {
		if(height>0) {
			this.height = height;
			return true;
		}
		return false;
	}
}
