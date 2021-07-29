package com.xms.basic.day01;
public class Circle {
	
		private double radius;

		public Circle(double r) {
			radius = r;
		}

		public Circle compare(Circle cir) {
			// 程序代码
			double oR = cir.radius;
//			 if(this!=cir) {
//			 oR = cir.compare(cir).radius;
//			 }
	          return this.radius>oR?this:cir;
		}
	}

	

