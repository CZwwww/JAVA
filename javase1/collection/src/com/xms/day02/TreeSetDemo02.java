//package com.xms.day02;
//
//import java.util.TreeSet;
//
///**
// * @author czw
// * @create 2021-06-15-下午 3:54
// */
//public class TreeSetDemo02 {
//    public static void main(String[] args) {
//        TreeSet<Dog> ts = new TreeSet<>((o1, o2) -> o1.age - o2.age == 0 ?
//                o2.name.compareTo(o1.name) :
//                o1.age - o2.age);
//        ts.add(new Dog("db",3));
//        ts.add(new Dog("xh",3));
//        ts.add(new Dog("zf",3));
//        ts.add(new Dog("ah",3));
//        ts.iterator().forEachRemaining(System.out::println);
//
//    }
//}
//class Dog implements Comparable<Dog>{
//    String name;
//    int age;
//
//    public Dog(){};
//
//
//    public Dog(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Dog{" +
//                "name=" + name +
//                ", age=" + age +
//                '}';
//    }
//
//    @Override
//    public int compareTo(Dog d) {
//        if(age!=d.age){
//            return age-d.age;
//        }
//
//        return name.compareTo(d.name);
//    }
//}
