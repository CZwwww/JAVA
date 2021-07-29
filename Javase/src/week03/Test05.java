package week03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test05 {
	public static void main(String[] args) {
		String str = "2020-07-20";
		String str1 = "2020-04-30";
		try {
			System.out.println(subDate(str,str1));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static int  subDate(String dateA,String dateB) throws ParseException {
		String str1 = dateA.substring(0, 4);
//		System.out.println(str1);
		String str2 = dateB.substring(0, 4);
//		System.out.println(str2);
		if(!str1.equals(str2)) {
			throw new RuntimeException("输入的日期年份不相同");
		}
		SimpleDateFormat sdf  = 
				new SimpleDateFormat("yyyy-MM-dd");
		Calendar cd = 
				Calendar.getInstance();
		Date d1 = sdf.parse(dateA);
		Date d2 = sdf.parse(dateB);
		cd.setTime(d1);	
		int day1 = cd.get(Calendar.DAY_OF_YEAR);
		cd.setTime(d2);
		int day2 = cd.get(Calendar.DAY_OF_YEAR);
		
		return day1-day2>0?day1-day2:day2-day1;
	}
}
