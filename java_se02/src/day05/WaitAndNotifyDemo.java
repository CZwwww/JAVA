package day05;

public class WaitAndNotifyDemo {
	/**
	 * ʹ��wait() ��notify()��������̵߳�
	 * Эͬ����,������������Object���з���
	 */
	public static boolean isFinish = false;
	public static Object obj  = new Object();
	public static void main(String [] args) {
		Thread download = new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("׼������");
				for(int i = 0 ; i<=100;i++) {
					if(i<30) {
						System.out.println("������"+i+"%");
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(i<60&&i>=30) {
						System.out.println("������"+i+"%");
						try {
							Thread.sleep(80);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(i>=60) {
						System.out.println("������"+i+"%");
						try {
							Thread.sleep(20);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println("�������");
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
					 * wait����
					 * �����̵߳�obj����notify()��������ȴ�;
					 */
					synchronized(obj) {
						obj.wait();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// TODO Auto-generated method stub
				System.out.println("׼����ʾͼƬ");
				if(!isFinish) {
					throw new RuntimeException("Non Image");
				}
				System.out.println("��ʾͼƬ");
			}
		};
		download.start();
		display.start();
	}
}
