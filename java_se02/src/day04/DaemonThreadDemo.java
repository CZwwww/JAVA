package day04;

public class DaemonThreadDemo {
	//后台线程的特点
	public static void main(String[] args) {
		//Rose:前台线程
		Thread rose = new Thread() {
			public void run() {
				for(int i =0;i<5;i++) {
					System.out.println("Rose:Let me jump");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Rose:Ah ah ah ah ah ah ah ah");
				System.out.println("putong");
			}
		};
		//Jack:后台线程
		Thread jack = new Thread() {
			public void run() {
				while(true) {
					System.out.println("Jack:You jump!I jump!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		/*
		 * 设置后台线程
		 * setDaemon(true)
		 */
		jack.setDaemon(true);
		rose.start();
		jack.start();
	}
}
