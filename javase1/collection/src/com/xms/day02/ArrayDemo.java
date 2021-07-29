package com.xms.day02;

/**
 * @author czw
 * @create 2021-06-15-上午 9:32
 */
public class ArrayDemo {
    public static void main(String[] args) {
        Fruit[] fArr = new Apple[5];
        fArr[0] = new Peach();//ArrayStoreException
    }

    public static <T> Fruit getFurit(T[] arr ){return null;};
}
class Fruit{}
class Apple extends Fruit{}
class Peach extends Fruit{}