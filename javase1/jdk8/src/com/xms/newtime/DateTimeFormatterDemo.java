package com.xms.newtime;

import com.xms.Stream.Employee;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * @author czw
 * @create 2021-06-29-下午 5:58
 */
public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        Instant ins = Instant.now();//不能格式化
        LocalDateTime ldt = LocalDateTime.now();
        String format = dtf.format(ldt);
        System.out.println(format);
        String time = "2020-06-29 18:20:42";
        //几乎不用,解析出的时间只能是接口类型
        TemporalAccessor parse = dtf.parse(time);
        //常用
        LocalDateTime ldt1 = LocalDateTime.parse(time,dtf);
        System.out.println(ldt1);
        //可以使用ThreadLocal包装共享资源来解决线程安全问题
        ThreadLocal<Employee[]> tl = ThreadLocal.withInitial(()->new Employee[5]);
    }
}
