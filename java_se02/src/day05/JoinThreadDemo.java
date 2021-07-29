package day05;

public class JoinThreadDemo {
	/**
	 *  线程的协同工作
	 */
	public static boolean isFinish = false;
	public static void main(String[] args)  {
		//下载图片的线程
		Thread download = new Thread() {
			public void run() {
				System.out.println("开始下载图片");
				for(int i =0;i<30;i++) {
					System.out.println("已完成"+i+"%");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				for(int i =30;i<=100;i++) {
					System.out.println("已完成"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("图片下载完毕");
				isFinish = true;
			}
		};
		Thread display = new Thread() {
			public void run() {
				try {
					download.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("准备显示图片");
				if(!isFinish) {
					throw new RuntimeException("不存在此图片");
				}
				System.out.println("显示图片");
			}
		};
		download.start();
		display.start();
		
		//显示图片的线程
	}
}
