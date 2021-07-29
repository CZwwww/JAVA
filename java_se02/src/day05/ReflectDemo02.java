package day05;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo02 {
	//��ȡ�ֽ����ļ������еĹ�����
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		createNewObject_1();
		createNewObject_2();
	}
	//��ȡ�޲ι�����
	public static void createNewObject_1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class clazz = Class.forName("reflect.Person");
		//���ʹ���޲ι�������������
		Object obj = clazz.newInstance();
	}
	//��ȡ�вι�����
	public static void createNewObject_2() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class clazz = Class.forName("reflect.Person");
		Constructor cons = 
						clazz.getConstructor(int.class,String.class);
		cons.newInstance(23,"����");
				
	}
}
