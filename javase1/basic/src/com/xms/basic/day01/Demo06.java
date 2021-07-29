package com.xms.basic.day01;

public class Demo06 {
	public static void main(String[] args) {
		/*
		 * +用于连接符
		 * 连接符:将字符串和其他类型相连,组成一个新的字符串
		 * 只有当+左边或右边存在字符串的时候,+才会用作连接符
		 */
	/*	System.out.println("1"+2);
		System.out.println("1"+2+3);
		System.out.println("1"+2+"3");
		System.out.println(1+'2'+"3");
		///整除(只有当被除数和除数都是整数的时候才是真的整除)
		//作为整除的时候,结果为商
		System.out.println(5/2);
		System.out.println(-5/2);
		System.out.println(5/-2);
		System.out.println(-5/-2);
		
		//下面不是整除
		System.out.println(5.0/2);//2.5
		System.out.println(5/2.0);//2.5
		System.out.println(5.0/2.0);//2.5
		
		//%取模
		System.out.println(5%2);
		System.out.println(-5%2);
		System.out.println(5%-2);
		System.out.println(-5%-2);
		System.out.println("----------------------");
		
		//++(自增)
		int a = 3;
		//++可以放在变量的前面,也可以放在变量的后面
		//如果++单独运算,在前在后无所谓;
		a++;
		System.out.println("a="+a);
		++a;
		System.out.println("a="+a);
		
		//如果参与运算,++在前先自增再运算,++在后先运算再自增
		int b = 2;
		System.out.println(++b);//3
		b = 2;
		System.out.println(b++);//2
		System.out.println(b);//3
		
		int i = 3;
		int j = i++ + 2;
		System.out.println("i="+i+","+"j="+j);
		
		int i1 = 3;
		int j1 = ++i1 + 2;
		System.out.println("i="+i1+","+"j="+j1);
		
		//注意:下面情况下只会执行第一个复制操作
		int k = 5;
		k = k++;
		System.out.println(k);
		
		System.out.println("--------------");
		int l = 5;
		l = l++ + ++l;
		System.out.println(l);
		
		System.out.println("---------------------");*/
//		int m = 3;
//		int n = m++ - --m + ++m +m-- + --m - m++ + --m -m++ + ++m;//12
		//      3   -  3  +  4  +4   +  2  - 2   +  2  -2  +   4  
//		System.out.println(n);
//		int a = 8 ;
//		int b = 3 ;
//		System.out.println(a>>>b|2);//1
//		short sh = 1;
//		sh =sh+ 1;
		int a=3,b=8;

		int c=(a>b)?a++:b++;
		System.out.println("a="+a+"\tb="+b+"\tc="+c);  //3\t9\t8

		int d=(a>b)?++a:++b;
		System.out.println("a="+a+"\tb="+b+"\td="+d);  //3\t10\t10

		int e=(a<b)?a++:b++;
		System.out.println("a="+a+"\tb="+b+"\te="+e);  //4\t10\t3

		int f=(a<b)?++a:++b;
		System.out.println("a="+a+"\tb="+b+"\tf="+f);  //5\t10\t5
	}
}
