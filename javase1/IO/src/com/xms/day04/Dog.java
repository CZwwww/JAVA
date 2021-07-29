package com.xms.day04;

import java.io.Serializable;

/**
 * @author czw
 * @create 2021-06-18-上午 11:16
 */
public class Dog implements Serializable {
    public static final long serialVersionUID = 7160650312005577930l;
    String name;
    int age;
    Cat partner;

    public Dog(String name,int age) {
        this.name = name;
        this.age = age;

    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", partner=" + partner +
                '}';
    }
}
