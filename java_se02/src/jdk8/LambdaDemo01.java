package jdk8;

//import java.util.concurrent.Executor;
//import java.util.concurrent.Executors;

public class LambdaDemo01 {
	public static void main(String[] args) {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("hellowWorld");
			}};
		Thread t1 = new Thread(r);
		t1.start();
		Runnable r2 = 
				()->System.out.println("HelloLambda");
		Thread t2 = new Thread(r2);
		t2.start();

//		Executor threadPool =     œﬂ≥Ã≥ÿªÿ“‰
//				Executors.newFixedThreadPool(4);
//		threadPool.execute(r);
	}
}
