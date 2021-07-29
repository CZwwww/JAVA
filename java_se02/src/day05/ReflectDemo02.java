package day05;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo02 {
	//获取字节码文件对象中的构造器
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		createNewObject_1();
		createNewObject_2();
	}
	//获取无参构造器
	public static void createNewObject_1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class clazz = Class.forName("reflect.Person");
		//如何使用无参构造器创建对象
		Object obj = clazz.newInstance();
	}
	//获取有参构造器
	public static void createNewObject_2() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class clazz = Class.forName("reflect.Person");
		Constructor cons = 
						clazz.getConstructor(int.class,String.class);
		cons.newInstance(23,"旺财");
				
	}
}
