package day04;

public class InterruptedExceptionDemo {
	//�ж��쳣
	public static void main(String[] args) {
		/*
		 * ������:����ʦ
		 */
		Thread cai  = new Thread() {
			public void run() {
				System.out.println("��:\"�մ�������,�е���,С�һ�����\"");
				try {
					Thread.sleep(3600*1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("��:\"������!������!�˼�˯����!\"");
				}
			}
		};
		/*
		 * ������:����ʦ
		 */
		Thread zhou = new Thread() {
			public void run() {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("��:\"��Ҫ��ʼ��ǽ��\"");
				for(int i = 0;i<5;i++) {
					System.out.println("��:\"�ѵ�\"");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				}
				if(!cai.isInterrupted()) {
					cai.interrupt();
					System.out.println("��:\"�㶨\"");
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