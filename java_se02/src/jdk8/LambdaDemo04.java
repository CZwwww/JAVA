package jdk8;

import java.util.function.Consumer;

public class LambdaDemo04 {
	public static void main(String[] args) {
		/*
		 * �﷨��ʽ2:
		 * ��һ������,���޷���ֵ
		 */
		Consumer<String> con1 = new Consumer<String>() {
			public void accept(String s) {
				// TODO Auto-generated method stub
				System.out.println(s);
			}};
			con1.accept("�Ұ�java");
			Consumer<String> con2 = (s)->System.out.println(s);
			con2.accept("�Ҷ�java�������");
			Consumer<String> con3 = 
					str->System.out.println(str);
					con3.accept("hahaha");
	}
}
