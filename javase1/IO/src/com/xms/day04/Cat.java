package com.xms.day04;

import java.io.Serializable;

/**
 * @author czw
 * @create 2021-06-18-上午 11:16
 */
public class Cat implements Serializable {
    private static final long serialVersionUID = -6881118432264610283L;
    String name;
    int age
            ;
    transient Student owner;
    public Cat(String name,int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +"age='"+age+'\''+
                '}';
    }
}
