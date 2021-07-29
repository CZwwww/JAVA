package com.xms.day03;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author czw
 * @create 2021-06-22-上午 11:28
 */
public class TimerDemo {
    public static void main(String[] args) {
        Timer time = new Timer();
        time.schedule(new TimerTask() {
            @Override
            public void run() {
                deleteFloder(new File("C:\\Users\\Administrator\\Desktop\\demo"));
            }
        },setTime("12:02:00"));
    }

    private static void deleteFloder(File f) {
        if(f.isDirectory()){
            File[] files = f.listFiles();
            for (File file : files) {
                deleteFloder(file);

            }
            f.delete();
        }else{
            f.delete();
        }
    }

    private static Date setTime(String s) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        try {
            Date target = sdf.parse(s);
            return target;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


}
