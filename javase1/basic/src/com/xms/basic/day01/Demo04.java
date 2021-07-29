package com.xms.basic.day01;
//基本类型
public class Demo04 {
	public static void main(String[] args) {
			//字符:单个的文字或符号,用''括起来
		char c = 'a';
		c = '1';
		c = '中';
		c = 'の';
		c = '☝';
		System.out.println(c);
		
		//字符本质上是一个整数
		/*
		 * ASCII码(键盘上所有符号的编码表)
		 * '0'     48
		 * 'A'     65
		 * 'a'	   97
		 * 其他所有编码表都兼容ASCII码,Java使用Unicode编码
		 */

		char c2 = 'a';
		System.out.println(c2);
		System.out.println(c2+1);
		int a = 'A';
		System.out.println((char)a);
		
		//特殊字符
		System.out.println("aaa\n");
		System.out.print("bbb");
		System.out.print('\r');
		System.out.println("ccc");
		System.out.print('\t');
		System.out.println("ddd");
		System.out.println('\\');
		System.out.println('\'');
		System.out.println('\"');
		System.out.println("\u9999");//通过unicode查询16进制数9999对应的字符
		//String(字符串),用""括起来,里面可以存放0,1或多个字符
		String s1 = "";
		s1 = "a";
		s1 = "abc";
		System.out.println("--------------");
		
		
		
	}
}
