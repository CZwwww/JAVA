package jdk8;

public class LambdaDemo03 {
	public static void main(String[] args) {
		/*
		 * �﷨��ʽ:
		 * �޲���,�޷���ֵ
		 */
		Runnable r1 = new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("HelloWorld");				
			}
		};
		Runnable r2 = ()->System.out.println("HelloLambda");
		
	
 
	}
}
