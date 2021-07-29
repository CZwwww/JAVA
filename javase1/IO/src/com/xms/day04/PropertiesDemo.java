package com.xms.day04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

/**
 * @author czw
 * @create 2021-06-18-下午 2:27
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
//        demo();
        demo01();
    }

    private static void demo01() throws IOException {
        Properties p = new Properties();
        FileReader fr = new FileReader("IO\\iofile\\student.properties");
        p.load(fr);
        System.out.println(p);
        p.setProperty("name","张三丰");
        p.setProperty("age","21");
        FileWriter fw = new FileWriter("IO\\iofile\\student.properties");
        p.store(fw,"jhaha");
        fr.close();
        fw.close();
    }

    private static void demo() {
        //创建属性集合
        Properties p = new Properties();
        //添加属性
        p.setProperty("001","李四");
        p.setProperty("002","张三");
        p.setProperty("003","王五");
        p.setProperty("004","赵六");
        System.out.println(p.getProperty("001"));

        //获取所有属性名
        Set<String> id = p.stringPropertyNames();
        id.iterator().forEachRemaining(System.out::println);
        System.out.println("------------------------------------------");
        final Enumeration<?> names = p.propertyNames();
        while (names.hasMoreElements()){
            System.out.println(names.nextElement());
        }
    }
}
