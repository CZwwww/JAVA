package day05;

import reflect.Person;

public class ReflectDemo01 {
	/**
	 * 想要对字节码文件进行解剖,
	 * 首先必须获取字节码文件对象
	 */
	public static void main(String[] args) {
		getClassObject_1();
		getClassObject_2();
		getClassObject_3();
	}
	/*
	 * 获取字节码文件对象的方式1
	 * Object类中提供了一个getClass()方法
	 * 需要创建对象,多此一举,没什么用
	 * 
	 */
	public static void getClassObject_1() {
		
		Person p = new Person();
		Class clazz = p.getClass();
		System.out.println(clazz);
		Person p1 = new Person();
		Class clazz1 = p1.getClass();
		System.out.println(clazz==clazz1);//返回true,说明字节码文件对象是一个
		//getClass方法获取的字节码文件对象是同一个对象
	}
	/*
	 * 获取字节码文件对象的方式2:
	 * 任何数据类型都具备一个静态的属性class
	 * 可以获取相对应的字节码文件对象
	 * 需要一个明确的类名
	 */
	public	static void getClassObject_2() {
		Class clazz = Person.class;
		System.out.println(clazz);
	}
	/*
	 * 获取字节码文件对象的方式3:
	 * 只需要通过给定的类的字符串名称
	 * 就可以获取该类对应的字节码文件对象
	 * Class-->forName()
	 */
	public static void getClassObject_3() {
		try {
			Class clazz = Class.forName("reflect.Person");
			System.out.println(clazz);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			 .class
		}
	}
}
