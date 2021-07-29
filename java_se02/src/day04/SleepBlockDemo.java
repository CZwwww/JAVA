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
		//阻塞时间结束后会进入Runnable等待状态而不是运行状态,有可能
		//在等待时cpu恰好在执行其他线程,当前打印时间的任务没有被执行
		//就可能出现跳秒的情况
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