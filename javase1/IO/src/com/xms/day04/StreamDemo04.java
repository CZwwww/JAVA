package com.xms.day04;

import java.io.*;

/**
 * @author czw
 * @create 2021-06-18-上午 11:20
 */
public class StreamDemo04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        demo();
        demo1();
    }
    private static void demo() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("IO\\iofile\\dog.txt"));
        oos.writeObject(new Dog("小黑",5));
        oos.close();
    }
    private static void demo1() throws IOException, ClassNotFoundException {
        ObjectInputStream oos = new ObjectInputStream(new FileInputStream("IO\\iofile\\dog.txt"));
        Dog dog = (Dog)oos.readObject();
        System.out.println(dog);
        oos.close();
    }
}
