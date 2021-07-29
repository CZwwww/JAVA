package com.xms.day02;
/**
 * 编程8：
定义一个类，用于描述坐标点
0——————>X
          | 
          |
          |          P(X,Y)
          |
          |
          Y  
（1具计算当前点到原点距离的功能
（2求到任意一点（m，n的距离
（3求到任意一点（Point p的距离
（4具坐标点显示功能，显示格式（x，y
（5提供无参的构造器和一个有参的构造器
 * @author Administrator
 *
 */
public class Point {
	double x;
	double y;
	Point(){
		
	}
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	double getDistance(double x,double y) {
		return Math.sqrt((this.x-x)*(this.x-x)
				+(this.y-y)*(this.y-y));
	}
	double getDistance(Point p) {
		return this.getDistance(p.x,p.y);
	}
	void getInfo() {
		System.out.println("("+x+","+y+")");
	}
}
