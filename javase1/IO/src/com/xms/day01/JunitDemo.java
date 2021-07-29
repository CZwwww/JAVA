package com.xms.day01;

import org.junit.After;
import org.junit.Test;

import java.io.File;

/**
 * @author czw
 * @create 2021-06-16-下午 2:28
 */
public class JunitDemo {
    File file;

    @Test
    public void test(){
        System.out.println(File.pathSeparator);
        System.out.println(File.separatorChar);

    }
    @After
    public void test2(){

    }
}
