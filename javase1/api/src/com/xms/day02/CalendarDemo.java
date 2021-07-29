package com.xms.day02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author czw
 * @create 2021-06-09-上午 10:34
 */
public class CalendarDemo {
    private static final int YEAR_BEGIN =1990 ;

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date beginTime = createBeginDate(1,1);
        String someDayStr = sc.next();
        checkError(someDayStr);
        Date someDay = sdf.parse(someDayStr);
        long sub = someDay.getTime()-beginTime.getTime();
//        System.out.println(sub);
        System.out.println(getResult(sub));
        sc.close();
    }

    private static Date createBeginDate(int month,int day) {
        Calendar cd = Calendar.getInstance();
        cd.set(Calendar.YEAR,YEAR_BEGIN);
        cd.set(Calendar.MONTH,month);
        cd.set(Calendar.DATE,day);
        Date beginTime = cd.getTime();
        return beginTime;
    }

    private static void checkError(String someDayStr) {
        if(someDayStr.isEmpty())
           throw new RuntimeException("日期不能为空");

        String[] chArr = someDayStr.split("-");
        if(chArr.length!=3)
            throw new RuntimeException("请按照规定的格式输入");

        int year = Integer.parseInt(chArr[0]);
        int month = Integer.parseInt(chArr[1]);
        int day = Integer.parseInt(chArr[2]);
        if(year<YEAR_BEGIN||month>12||day>31||month<1||day<1)
            throw new RuntimeException("请按照规定的格式输入");


    }

    public static String getResult(long sub){
        if(sub<0)
            throw new RuntimeException("您输入的日期有问题");
        String str = "";
        int day = (int)(sub/1000/3600/24);
        if(day%5<=3)
            str = "打渔";
        if(day%5>=3)
            str = "晒网";
        return str;
    }
}
