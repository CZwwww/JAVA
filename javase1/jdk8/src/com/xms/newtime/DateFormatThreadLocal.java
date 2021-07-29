package com.xms.newtime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 封装时间格式器
 * @author czw
 * @create 2021-06-29-下午 3:20
 */
public class DateFormatThreadLocal {
    //使用ThreadLocal来封装时间格式器(同一时间只能有一个线程对象去使用ThreadLocal封装的对象)
    private final static ThreadLocal<DateFormat> tl = new ThreadLocal<DateFormat>(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        @Override
        protected DateFormat initialValue() {
            return simpleDateFormat;
        }
    };
    public static Date parse(String time) throws ParseException {
        return tl.get().parse(time);
    }
}
