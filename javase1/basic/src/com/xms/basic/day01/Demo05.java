package com.xms.basic.day01;

class Demo05{
	public static void main(String[] args) {
		//默认转换,小类型转大类型
		byte b = 10;
		int a = b;//默认转换,先将b默认转换成int,再执行默认操作
		
		//强制转换:大类型转成小类型
		int m = 10;
		byte n = (byte)m;//强制转换,需要手动进行转换
		System.out.println(a);
		System.out.println(n);
		
		//注意:在进行强转的时候可能会有数据损失
		//在强转的时候需要保证强转值在强转类型范围内,否则不应该强转
		m = 10000;
		n = (byte)m;
		System.out.println(n);
		//byte short char 参与运算时会自动转换成int
		short s = 1;
		s = (short) (s + 2);//s+2是int类型,需要强转
		
		//short和char之间要进行相互转换
		short sh = 97;
		char c = (char) sh;
		System.out.println(c);//'a'
		char c2 = 'A';
		short sh2 = (short) c2;
		System.out.println(sh2);
		
		//不涉及敞亮的运算,只针对变量的运算
		/*
		 * 如果是常量值进行运算,会县运算计算结果,
		 * 看结果是否超出变量范围,如果没有超出直接赋值,
		 * 如果超出结果为int类型,需要强转
		 */
		byte b2 = 1+2;
		byte b3 = (byte) (127+2);
		
		int d = 1;
		byte b4 = (byte) (d+2);
		
		System.out.println("--------------");
		char x = 'x';
		int y = 10;
		System.out.println(true?x:y);
		System.out.println(true?x:10);
		
	}
}