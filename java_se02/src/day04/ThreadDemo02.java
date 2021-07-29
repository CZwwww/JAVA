package day04;

public class ThreadDemo02 {
	/**
	 * 创建线程的第二种方式:实现Runnable接口
	 * 优点:将任务和线程解耦(线程与任务分离)
	 * @param args
	 */
	public static void main(String[] args) {
		Runnable r1 = new Runnable1();
		Runnable r2 = new Runnable2();
		//创建线程时将任务进行指派
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}
//该类就是任务类
class Runnable1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++) {
			System.out.println("你是谁啊?");
		}
	}
	
}
class Runnable2 implements Runnable{
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("我是收电费的");
		}
	}
}
