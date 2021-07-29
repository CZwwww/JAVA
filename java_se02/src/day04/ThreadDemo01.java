package day04;

public class ThreadDemo01 {
	/**
	 * 创建线程的第一种方式:继承Thread类
	 */
	public static void main(String[] args) {
		Thread t1 = new Person1();
		Thread t2 = new Person2();
		t1.start();
		t2.start();
		/*
		 * 此处两个线程的执行没有先后顺序
		 * 线程调度给线程分配时间片段让cpu去执行
		 * 线程时,并没有一次性将某个线程执行完毕
		 * 并且分配的时间片段长短也不是百分百均匀的
		 * 执行有先后顺序是同步运行
		 * 没有先后顺序是异步运行(并发运行)
		 * 
		 */
	}
	
}
//Person1类就是一个线程类,该类的实例可以当做线程使用
class Person1 extends Thread{
	//在线程里面发布任务需要重写run()方法
	public void run() {
		for(int i  = 0;i<1000;i++) {
			System.out.println("你是谁呀?");
		}
	}
}
class Person2 extends Thread{
	public void run() {
		for(int i  = 0;i<1000;i++) {
			System.out.println("我是查水表的");
		}
	}
}