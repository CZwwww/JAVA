package com.xms.newtime;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author czw
 * @create 2021-06-29-下午 2:54
 */
public class Demo01 {
    @Test
    public void test() throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor tpe = (ThreadPoolExecutor)executorService;
        List<Future<Date>> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        Callable<Date> callable =()->{synchronized(tpe){return sdf.parse("2020-12-12  12:12:12");}};
        for(int i = 0;i<10;i++){
            list.add(tpe.submit(callable));
        }

        list.forEach(e-> {
            try {
                e.get();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            } catch (ExecutionException ex) {
                ex.printStackTrace();
            }
            tpe.shutdown();
        });
    }
    @Test
    public void test2() throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor tpe = (ThreadPoolExecutor)executorService;
        List<Future<LocalDate>> list = new ArrayList<>();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Callable<LocalDate> callable =()->LocalDate.parse("2020-12-12",dateTimeFormatter);
        for(int i = 0;i<10;i++){
            list.add(tpe.submit(callable));
        }

        list.forEach(e-> {
            try {
                System.out.println( e.get());
            } catch (InterruptedException | ExecutionException ex) {
                ex.printStackTrace();
            }
        });
    }
}
