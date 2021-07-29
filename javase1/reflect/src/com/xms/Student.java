package com.xms;

import java.io.IOException;

/**
 * @author czw
 * @create 2021-06-23-下午 4:43
 */
public class Student {
    String name;
    private int age;

    private  Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void study() {
        System.out.println("学习");
    }
    private void show()throws IOException{
        System.out.println("show");
    }
    @Czw
    @Override
    public String toString()  {
        return "com.xms.Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
