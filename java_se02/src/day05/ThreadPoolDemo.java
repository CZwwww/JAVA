package day05;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
	//线程池
	public static void main(String[] args) {
		Executor threadPool = 
				Executors.newFixedThreadPool(5);
		Process p1 = new Process();
		Process p2 = new Process();
		Process p3 = new Process();
		Process p4 = new Process();
		Process p5 = new Process();
		//将任务交给线程池处理
		threadPool.execute(p1);
		threadPool.execute(p2);
		threadPool.execute(p3);
		threadPool.execute(p4);
		threadPool.execute(p5);
	}
}
class Process implements Runnable{
	static int index = 1;
	int id ;
	public Process() {
		id = index++;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(id+"开始~~");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(id+"结束!!");
	}
}