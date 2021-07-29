package com.xms.day02;

//import com.xms.oop.day02.First.Contents;

public class First {
	private static int a;
	static int b = 5;
	public static class Contents{
		public int c;
		static int d;
		public void f(){
			System.out.println(a);
			System.out.println(b);
		}
	}
	 class  Titles{
		public int e;
		 int f;
		public void show(){
			System.out.println(a);
			System.out.println(b);
		}
	}
	public void getInnerClassDate(){
		System.out.println(new Contents().c);//需要创建内部类对象
		System.out.println(Contents.d);//
		System.out.println(new Titles().f);//
		System.out.println(new Titles().e);//
	}

}

class TestFirst{
	public static void main(String[] args) {
		First.Contents fc = new First.Contents();//静态内部类的对象的创建是new 外部类名.内部类构造器
		First.Titles t = new First().new Titles();//成员内部类的对象创建方法是外部对象.内部对象
	}
}