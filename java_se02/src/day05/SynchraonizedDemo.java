package day05;

public class SynchraonizedDemo {
	public static void main(String[] args) {
		Table table = new Table();
//		Thread t1 = new Person(table);
//		Thread t2 = new Person(table);
//		t1.start();
//		t2.start();
	}
}
class Table{
	public int beans =20;
	public synchronized int catchBeans() {
		int num = 4;
		String color = "yellow";
		System.out.println("!");
		synchronized (this) {
			if(beans<=0) {
				throw new RuntimeException("豆没了");
			}
			//主动让出cpu让线程离开running进入runnable状态
			Thread.yield();
			return --beans;
		}
	
	}
}
//class Person extends Thread{
//	private Table table;
//	
//	public Person(Table table) {
//		this.table = table;
//	}
//	@Override
//	public void run() {
//		for(;;) {
//			int bean = table.catchBeans();
//			System.out.println(this.getName()+":"+bean);
//		}
//	}
//}

