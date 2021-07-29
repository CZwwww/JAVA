package com.xms.day04;
abstract class Person{
	public abstract void show();
}
interface People{
	void eat();
}
		class SouthPeople implements People{
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("吃米饭");
			}
		}
		class NorthPeople implements People{
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("吃面");
			}
		}
class PersonTool{
	public static void printInfo(Person p) {
		p.show();
	}
}
public class InnerDemo05 {
	public static void main(String[] args) {
		PersonTool.printInfo(new Person() {
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("world");
			}
		});
	}
}
