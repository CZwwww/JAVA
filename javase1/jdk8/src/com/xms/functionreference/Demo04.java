package com.xms.functionreference;

import org.junit.Test;

import java.util.function.BiFunction;

/**
 * @author czw
 * @create 2021-06-28-上午 10:29
 */
class Student{
    String name;
    int age;
    Student(){}
    Student(String name){
        this.name = name;
    }
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Demo04 {
    @Test
    public void test01(){
        BiFunction<String,Integer,Student> bf = Student::new;
        System.out.println(bf.apply("zs",10));
    }
}
