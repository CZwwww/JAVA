package day04;

public class DaemonThreadDemo {
	//��̨�̵߳��ص�
	public static void main(String[] args) {
		//Rose:ǰ̨�߳�
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
		//Jack:��̨�߳�
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
		 * ���ú�̨�߳�
		 * setDaemon(true)
		 */
		jack.setDaemon(true);
		rose.start();
		jack.start();
	}
}
