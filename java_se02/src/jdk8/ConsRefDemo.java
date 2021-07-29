package jdk8;

import java.util.function.Supplier;

public class ConsRefDemo {
	public static void main(String[] args) {
		Supplier<Employee> sup1 = 
				()->new Employee();
		System.out.println(sup1.get());
		Supplier<Employee> sup = 
				Employee::new;
		System.out.println(sup.get());
		/*
		 * 注意:调用的构造器参数列表要与函数式接口
		 * 中的抽象方法参数一致
		 */
	}
}
