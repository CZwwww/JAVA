package day05;

public class JoinThreadDemo {
	/**
	 *  �̵߳�Эͬ����
	 */
	public static boolean isFinish = false;
	public static void main(String[] args)  {
		//����ͼƬ���߳�
		Thread download = new Thread() {
			public void run() {
				System.out.println("��ʼ����ͼƬ");
				for(int i =0;i<30;i++) {
					System.out.println("�����"+i+"%");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				for(int i =30;i<=100;i++) {
					System.out.println("�����"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("ͼƬ�������");
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
				System.out.println("׼����ʾͼƬ");
				if(!isFinish) {
					throw new RuntimeException("�����ڴ�ͼƬ");
				}
				System.out.println("��ʾͼƬ");
			}
		};
		download.start();
		display.start();
		
		//��ʾͼƬ���߳�
	}
}
