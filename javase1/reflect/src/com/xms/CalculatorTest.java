package com.xms;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author czw
 * @create 2021-06-24-上午 11:34
 */
public class CalculatorTest {
    @Test
    public void test() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException {
        Class clazz = Calculator.class;
        Constructor constructor = clazz.getConstructor();
        Calculator c = (Calculator) constructor.newInstance();

        Method[] methods = clazz.getDeclaredMethods();
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\bug.txt"));
        int count = 0;
        for (Method method : methods) {
            if(method.isAnnotationPresent(com.xms.Check.class)){
                try {
                    method.invoke(c);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    count++;
                    bw.write("方法名:"+method.getName());
                    bw.newLine();
                    bw.write("异常名:"+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常原因:"+e.getCause().getClass());
                }
            }
        }
        bw.newLine();
        bw.write("一共发生了"+count+"次异常");
        bw.close();

    }
}
