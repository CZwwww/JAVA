package com.xms.day02;

import java.util.HashSet;
import java.util.Set;

/**
 * @author czw
 * @create 2021-06-15-下午 2:20
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Set<Animal> set = new HashSet<>();
        set.add(new Cat("xh",1));
        set.add(new RedCat("xh",3));
        set.add(new BlueCat("xl",3));
        set.iterator().forEachRemaining(System.out::println);

    }
}
class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }
}
class RedCat extends Cat{

    public RedCat(String name, int age) {
        super(name, age);
    }
}
class BlueCat extends Cat{

    public BlueCat(String name, int age) {
        super(name, age);
    }
}
//class Dog extends Animal{
//    public Dog(String name, int age) {
//        super(name, age);
//    }
//}
class Animal{
    String name;
    int age;
    public Animal(){

    }
    public Animal(String name,int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
