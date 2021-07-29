package week03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd");
		Calendar cd  = 
				Calendar.getInstance();
		Date inDate = sdf.parse(str);
		cd.setTime(inDate);
		int mYear = cd.get(Calendar.YEAR);
		int weekDay = cd.get(Calendar.DAY_OF_WEEK)-1;
		cd.add(Calendar.MONTH,1 );
		cd.set(Calendar.DATE, 1);
		cd.add(Calendar.DATE, -1);
		int dayOfMon = cd.get(Calendar.DATE);
		System.out.println(mYear);
		System.out.println(weekDay);
		System.out.println(dayOfMon);
		if(mYear%100!=0&&mYear%4==0||mYear%400==0) {
			System.out.println("该年是闰年");
		}else {
			System.out.println("该年是平年");
		}
	}
}
