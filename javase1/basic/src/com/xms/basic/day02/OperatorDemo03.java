package com.xms.basic.day02;
//逻辑运算符
public class OperatorDemo03 {
	public static void main(String[] args) {
		System.out.println(10<5&10==10);
		System.out.println(10>5&10==10);
		
		System.out.println(10>5|10!=10);
		System.out.println(10<5|10!=10);
		
		System.out.println(!(10!=10));
		System.out.println(getResult(1,-4,1));
		System.out.println(getResult(1,-2,1));
		
		System.out.println(10==10&&5>10);
		System.out.println(5<10&&10==10);
		
		//异或
		System.out.println(10>5^10!=10);
		System.out.println(10<5^10!=10);
	}
	static double getResult(int a,int b,int c){
        double d = b*b-4*a*c;
        if(d<0){
        	return 0;
        }else if (d==0){
        	return -b/2/a;
        }else{
        	return (-b+Math.sqrt(d))/a/2;
        }
		

	}
}
