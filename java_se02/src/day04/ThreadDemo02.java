package day04;

public class ThreadDemo02 {
	/**
	 * �����̵߳ĵڶ��ַ�ʽ:ʵ��Runnable�ӿ�
	 * �ŵ�:��������߳̽���(�߳����������)
	 * @param args
	 */
	public static void main(String[] args) {
		Runnable r1 = new Runnable1();
		Runnable r2 = new Runnable2();
		//�����߳�ʱ���������ָ��
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}
//�������������
class Runnable1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++) {
			System.out.println("����˭��?");
		}
	}
	
}
class Runnable2 implements Runnable{
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("�����յ�ѵ�");
		}
	}
}
