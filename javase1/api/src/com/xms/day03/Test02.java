package com.xms.day03;

import java.util.Calendar;

/**
 * @author czw
 * @create 2021-06-10-下午 4:21
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println(getDate(2020));

    }
    public static int getDate(int year){
        Calendar cd = Calendar.getInstance();
        cd.set(Calendar.YEAR,year);
        cd.set(Calendar.MONTH,Calendar.MARCH);
        cd.set(Calendar.DAY_OF_MONTH,1);
        cd.add(Calendar.DATE,-1);
        int days = cd.get(Calendar.DAY_OF_MONTH);
        return days;

    }
}
