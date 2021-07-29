package com.xms.factory.sf;

/**
 * @author czw
 * @create 2021-06-23-上午 10:09
 */
public class AnimalFactory {
    public static Animal getInstance(String name){
        if("Dog".equals(name))
            return new Dog();
        if("Cat".equals(name))
            return new Cat();
        return null;
    }
}
