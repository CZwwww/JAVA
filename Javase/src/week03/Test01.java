package week03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test01 {
	public static void main(String[] args)  {
//		String str = "3��2��2020��";
//		String str1 = str.substring(4);
//		String str2 = str.substring(0,4);
//		System.out.println(str1);
//		String str3 = str1.concat(str2);
//		System.out.println(str3);
		String str = "3��2��2020��";
		SimpleDateFormat sdf = 
				new SimpleDateFormat("M��d��yyyy��");
		try {
			Date day= sdf.parse(str);
			SimpleDateFormat sdf1 = 
					new SimpleDateFormat("yyyy��M��d��");
			String str1 = sdf1.format(day);
			System.out.println(str1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
