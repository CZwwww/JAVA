package com.xms.builder;

/**
 * 构建器设计模式
 * @author czw
 * @create 2021-06-23-上午 11:39
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三").setAge(19);//链式编程
        System.out.println(s);
    }
}
class Student{
    private String name;
    private int age;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }
}