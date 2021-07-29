package day04;

public class InterruptedExceptionDemo {
	//中断异常
	public static void main(String[] args) {
		/*
		 * 表演者:蔡老师
		 */
		Thread cai  = new Thread() {
			public void run() {
				System.out.println("蔡:\"刚打完篮球,有点累,小憩一会儿吧\"");
				try {
					Thread.sleep(3600*1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("蔡:\"干嘛呢!干嘛呢!人家睡觉呢!\"");
				}
			}
		};
		/*
		 * 表演者:周老师
		 */
		Thread zhou = new Thread() {
			public void run() {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("周:\"我要开始砸墙了\"");
				for(int i = 0;i<5;i++) {
					System.out.println("周:\"哐当\"");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				}
				if(!cai.isInterrupted()) {
					cai.interrupt();
					System.out.println("周:\"搞定\"");
				}
				
			
			}
		};
		cai.start();
		zhou.start();
		cai.start();
		cai.start();
	}
}
class Cai implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

class Zhou implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}