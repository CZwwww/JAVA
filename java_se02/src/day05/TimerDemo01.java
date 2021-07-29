package day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo01 {
	public static void main(String[] args) throws ParseException {
		//������ʱ������
		Timer timer = new Timer();
		//����ʱ��������Ӽƻ�����
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse("2021-04-26 16:51:00");
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("��ó�ҩ��!");
			}
		}, date);
	}
}
