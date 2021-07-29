package jdk8;

import java.util.Comparator;

public class LambdaDemo05 {
	public static void main(String[] args) {
		/*
		 * 语法格式4:
		 * 有两个以上的参数,有返回值,并且
		 * Lambda体中有多条语句,如果有
		 * 多条语句,Lambda体必须写大括号
		 */
		Comparator<Integer> com1 = 
				new Comparator<Integer>() {

					@Override
					public int compare(Integer o1, Integer o2) {
						// TODO Auto-generated method stub
						System.out.println("这里是匿名");
						return o1-o2;
					}
				};
	}
}
