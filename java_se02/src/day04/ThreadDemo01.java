package day04;

public class ThreadDemo01 {
	/**
	 * �����̵߳ĵ�һ�ַ�ʽ:�̳�Thread��
	 */
	public static void main(String[] args) {
		Thread t1 = new Person1();
		Thread t2 = new Person2();
		t1.start();
		t2.start();
		/*
		 * �˴������̵߳�ִ��û���Ⱥ�˳��
		 * �̵߳��ȸ��̷߳���ʱ��Ƭ����cpuȥִ��
		 * �߳�ʱ,��û��һ���Խ�ĳ���߳�ִ�����
		 * ���ҷ����ʱ��Ƭ�γ���Ҳ���ǰٷְپ��ȵ�
		 * ִ�����Ⱥ�˳����ͬ������
		 * û���Ⱥ�˳�����첽����(��������)
		 * 
		 */
	}
	
}
//Person1�����һ���߳���,�����ʵ�����Ե����߳�ʹ��
class Person1 extends Thread{
	//���߳����淢��������Ҫ��дrun()����
	public void run() {
		for(int i  = 0;i<1000;i++) {
			System.out.println("����˭ѽ?");
		}
	}
}
class Person2 extends Thread{
	public void run() {
		for(int i  = 0;i<1000;i++) {
			System.out.println("���ǲ�ˮ���");
		}
	}
}