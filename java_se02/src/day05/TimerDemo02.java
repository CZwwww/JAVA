package day05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo02 {
	public static void main(String[] args) {
		//创建计时器对象
		int min =1;
		long end = System.currentTimeMillis()+min*60*1000;
		Timer timer = new Timer();
		//给计时器添加自动计划任务
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				long show  = end - System.currentTimeMillis();
				long h = show/1000/3600;
				long m = show/1000/60;
				long s = show/1000%60;
				
				System.out.println(h+"时"+m+"分"+s+"秒");
				
			}
		},0,1000);
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				timer.cancel();
			}
		}, 60000);
	}
}
