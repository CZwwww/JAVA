package com.xms.basic.day01;

public class Demo03 {
	public static void main(String[] args) {
		int max = Integer.MAX_VALUE;//int最大值
		System.out.println(max);
		//运算类型要一致,max+1结果为int类型,值溢出了
		long a = max + 1;//溢出
		System.out.println(a);
		long b = max + 1l;//1l是long类型,计算时max默认转成long类型,max+1l结果为long类型
		System.out.println(b);
		
		//long一般用来处理时间
		long now = System.currentTimeMillis();
		long day = now/1000/3600/24;
		System.out.println(1970+day/365);
		
		long l = 100;
		//long类型变量初始化,建议添加后缀L
		long l2 = 100L;
		
		//整数常量值在定义的时候是没有类型的,在将该常量值用于运算的时候,
		//需要考虑类型.(原则怎么方便怎么来)
		
		byte by = 1;
//		by = 128;
		System.out.println(by);
		
		System.out.println("------------------");
		
		//浮点型
		//小数常量值默认是double,可在值后面添加后缀f/F,将类型变为float
		float f =(float) 1.1;
		float f2 = 3.11232141233435F;
//		double后缀D/d,一般不用添加
		double d =3.111232141233435;
		System.out.println("float:"+f2+","+"double"+d);
		
		//科学计数法
		double d2 = 3.1415E2;
		System.out.println("d2:"+d2);
		
		//浮点运算会有较高概率精度损失
		double d3 = 3;
		double d4 = 2.9;
		System.out.println(3-2.9);//0.10000000000000009
		
		System.out.println("---------------");
		//布尔型
		
		boolean b1 = true;
		boolean b2 = false;
	}
}
