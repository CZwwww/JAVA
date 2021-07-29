package day04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SleepBlockDemo {
	public static void main(String[] args) throws InterruptedException {
		SleepBlock sb = new SleepBlock();
		Thread t1 = new Thread(sb);
		
		t1.start();
	}
}
class SleepBlock implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//����ʱ�����������Runnable�ȴ�״̬����������״̬,�п���
		//�ڵȴ�ʱcpuǡ����ִ�������߳�,��ǰ��ӡʱ�������û�б�ִ��
		//�Ϳ��ܳ�����������
		SimpleDateFormat sdf = 
				new SimpleDateFormat("HH-mm-ss");
		while(true) {
			System.out.println(sdf.format(new Date()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}