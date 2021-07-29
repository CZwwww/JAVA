package com.xms.day04;

import java.io.Serializable;

/**
 * @author czw
 * @create 2021-06-18-上午 11:15
 */
public class Student implements Serializable {
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
