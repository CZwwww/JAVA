package day05;

public class WaitAndNotifyDemo {
	/**
	 * 使用wait() 和notify()方法完成线程的
	 * 协同工作,这两个方法是Object类中方法
	 */
	public static boolean isFinish = false;
	public static Object obj  = new Object();
	public static void main(String [] args) {
		Thread download = new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("准备下载");
				for(int i = 0 ; i<=100;i++) {
					if(i<30) {
						System.out.println("已下载"+i+"%");
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(i<60&&i>=30) {
						System.out.println("已下载"+i+"%");
						try {
							Thread.sleep(80);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(i>=60) {
						System.out.println("已下载"+i+"%");
						try {
							Thread.sleep(20);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println("下载完毕");
					isFinish = true;
					synchronized(obj) {
						obj.notify();
					}
				}
			}
		};
		Thread display = new Thread() {
			@Override
		
			public void run() {
				try {
					/*
					 * wait阻塞
					 * 其他线程的obj调用notify()方法解除等待;
					 */
					synchronized(obj) {
						obj.wait();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// TODO Auto-generated method stub
				System.out.println("准备显示图片");
				if(!isFinish) {
					throw new RuntimeException("Non Image");
				}
				System.out.println("显示图片");
			}
		};
		download.start();
		display.start();
	}
}
