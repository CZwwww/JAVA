package day05;

import reflect.Person;

public class ReflectDemo01 {
	/**
	 * ��Ҫ���ֽ����ļ����н���,
	 * ���ȱ����ȡ�ֽ����ļ�����
	 */
	public static void main(String[] args) {
		getClassObject_1();
		getClassObject_2();
		getClassObject_3();
	}
	/*
	 * ��ȡ�ֽ����ļ�����ķ�ʽ1
	 * Object�����ṩ��һ��getClass()����
	 * ��Ҫ��������,���һ��,ûʲô��
	 * 
	 */
	public static void getClassObject_1() {
		
		Person p = new Person();
		Class clazz = p.getClass();
		System.out.println(clazz);
		Person p1 = new Person();
		Class clazz1 = p1.getClass();
		System.out.println(clazz==clazz1);//����true,˵���ֽ����ļ�������һ��
		//getClass������ȡ���ֽ����ļ�������ͬһ������
	}
	/*
	 * ��ȡ�ֽ����ļ�����ķ�ʽ2:
	 * �κ��������Ͷ��߱�һ����̬������class
	 * ���Ի�ȡ���Ӧ���ֽ����ļ�����
	 * ��Ҫһ����ȷ������
	 */
	public	static void getClassObject_2() {
		Class clazz = Person.class;
		System.out.println(clazz);
	}
	/*
	 * ��ȡ�ֽ����ļ�����ķ�ʽ3:
	 * ֻ��Ҫͨ������������ַ�������
	 * �Ϳ��Ի�ȡ�����Ӧ���ֽ����ļ�����
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
