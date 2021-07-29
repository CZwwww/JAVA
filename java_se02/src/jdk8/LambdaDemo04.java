package jdk8;

import java.util.function.Consumer;

public class LambdaDemo04 {
	public static void main(String[] args) {
		/*
		 * 语法格式2:
		 * 有一个参数,且无返回值
		 */
		Consumer<String> con1 = new Consumer<String>() {
			public void accept(String s) {
				// TODO Auto-generated method stub
				System.out.println(s);
			}};
			con1.accept("我爱java");
			Consumer<String> con2 = (s)->System.out.println(s);
			con2.accept("我对java爱的深沉");
			Consumer<String> con3 = 
					str->System.out.println(str);
					con3.accept("hahaha");
	}
}
