package day01;
//单例模式(饿汉式)(?懒汉式?)
public class Singleton {
	//将构造器私有化
	private Singleton() {
		
	}
	//声明一个私有的静态的当前类的实例
	private static Singleton instance = 
			new Singleton();
	//声明一个公有的静态的能返回当前类实例的方法
	public static Singleton getInstance() {
		return instance;
	}
//	public Singleton createSingleton() {
//		return null;
//		
//	}
	public void showMessage() {
		System.out.println("HelloWorld");
	}
}
