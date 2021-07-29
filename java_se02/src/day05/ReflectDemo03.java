package day05;

import java.lang.reflect.Field;

import reflect.Person;

public class ReflectDemo03 {
	public static void main(String[] args) throws Exception {
		getFieldDemo();
		
	}
	//��ȡ�ֽ����ļ����ֶ�(����)
	public static void getFieldDemo() throws Exception{
		Class clazz = Class.forName("reflect.Person");
//		Field name = clazz.getField("age");//ֻ�ܻ�ȡ�����ֶ�
//		System.out.println(name);
		//��ȡ�ֽ����ļ�����Ȩ�����ε��ֶ�
		Field age = clazz.getDeclaredField("age");
		System.out.println(age);
		//�����ֶεĲ�����������ֵ�ͻ�ȡֵ
		
//		Object o = age.get(obj);	
//		System.out.println(o);
		age.setAccessible(true);
		Object obj = clazz.newInstance();
		age.set(obj, 101);
		Object o = age.get(obj);
		System.out.println(o);
	}
}
