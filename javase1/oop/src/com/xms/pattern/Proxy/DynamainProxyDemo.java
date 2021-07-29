package com.xms.pattern.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Human{
	void eat(String str);
	void speak(String str);
}
class SuperMan implements Human{
	@Override
	public void eat(String str) {
		// TODO Auto-generated method stub
		System.out.println("超人吃:"+str);
	}
	@Override
	public void speak(String str) {
		// TODO Auto-generated method stub
		System.out.println("超人说:"+str);
	}
}
class ProxyFactory{
	public static Object getProxyInstance(Object obj) {
		InvocationHandler h = new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				return method.invoke(obj, args);
			}
		};
		return Proxy.
				newProxyInstance(obj.getClass().getClassLoader(), 
				obj.getClass().getInterfaces(),
				h);
	}
}
public class DynamainProxyDemo {
	public static void main(String[] args) {
		Human h = new SuperMan();
		Human h1 = (Human)ProxyFactory.getProxyInstance(h);
		h1.eat("苹果");
		h1.speak("苹果真好吃");
		
	}
}
