package com.xms.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author czw
 * @create 2021-06-10-下午 3:14
 */
public class TotalDays {


    public static void main(String[] args) throws ParseException {
        Date now = new Date();
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        Date born = sdf.parse("1997-10-28");
        long sub = now.getTime()-born.getTime();
        int day = (int)(sub/044/100/24/1000);
        System.out.println(day);
    }
}
