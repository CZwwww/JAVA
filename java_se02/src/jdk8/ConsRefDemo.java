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
		 * ע��:���õĹ����������б�Ҫ�뺯��ʽ�ӿ�
		 * �еĳ��󷽷�����һ��
		 */
	}
}
