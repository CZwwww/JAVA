package day05;

import java.lang.reflect.Field;

import reflect.Person;

public class ReflectDemo03 {
	public static void main(String[] args) throws Exception {
		getFieldDemo();
		
	}
	//获取字节码文件中字段(属性)
	public static void getFieldDemo() throws Exception{
		Class clazz = Class.forName("reflect.Person");
//		Field name = clazz.getField("age");//只能获取公有字段
//		System.out.println(name);
		//获取字节码文件所有权限修饰的字段
		Field age = clazz.getDeclaredField("age");
		System.out.println(age);
		//对于字段的操作就是设置值和获取值
		
//		Object o = age.get(obj);	
//		System.out.println(o);
		age.setAccessible(true);
		Object obj = clazz.newInstance();
		age.set(obj, 101);
		Object o = age.get(obj);
		System.out.println(o);
	}
}
