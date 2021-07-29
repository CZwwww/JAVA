package day05;

import java.lang.reflect.Method;

public class ReflectDemo04 {
	public static void main(String[] args) throws Exception {
		getMethodDemo_1();
		getMethodDemo_3();
	}
	public static void getMethodDemo_1() throws Exception{
		Class clazz = Class.forName("reflect.Person");
		/*Method[] method01 = clazz.getMethods();
		for(Method m :method01) {
			System.out.println(m);
		}*/
		Method[] m1= clazz.getDeclaredMethods();
		for(Method method:m1) {
			System.out.println(method);
		}
	}
	public static void getMethodDemo_2() throws Exception{
		Class clazz = Class.forName("reflect.Person");
		Method m2 = clazz.getMethod("show",null );
		System.out.println(m2);
		Object obj = clazz.newInstance();
		m2.invoke(obj, null);
	}
	public static void getMethodDemo_3() throws Exception{
		Class clazz = Class.forName("reflect.Person");
		Method m3 = clazz.getMethod("paramMethod", 
													String.class,int.class);
		Object obj = clazz.newInstance();
		m3.invoke(obj,"¹þ¹þ",101);
		
	}
	
}
