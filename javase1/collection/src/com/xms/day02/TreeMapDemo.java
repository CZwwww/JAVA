package com.xms.day02;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

/**
 * 创建一个----
 * key是dog对象value是狗的品种
 * 排序规则:先按照狗的年龄由大到小进行排序,如果年龄相同按照姓名字典顺序进行排序
 * 提供自然排序和比较器排序两个版本
 * 对集合进行遍历
 * @author czw
 * @create 2021-06-15-下午 5:53
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Dog,String> tm = new TreeMap<>((o1, o2) ->o1.age!=o2.age?o2.age-o1.age:o2.name.compareTo(o1.name));
        tm.put(new Dog("hh",5),"金毛");
        tm.put(new Dog("xh",5),"阿拉斯加");
        tm.put(new Dog("jh",4),"哈士奇");
        tm.put(new Dog("wh",3),"拉布拉多");
        tm.forEach((dog, s) -> System.out.println(dog.toString()+"品种:"+s));
//        System.out.println(tm.size());
//        for(Map.Entry<Dog,String> e:tm.entrySet()){
//            System.out.println(e.getKey()+","+e.getValue());
//        }
//        Set<Map.Entry<Dog,String>> s= tm.entrySet();
//        s.iterator().forEachRemaining(System.out::println);
        Integer[] daces = {1,2,3,4,5,6};
        List<Integer> list = Arrays.asList(daces);
        System.out.println(list.size());
        list.add(5);
        System.out.println(list.size());
    }
}

class Dog implements Comparable<Dog> {
    String name;
    int age;
    public Dog(){}
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Dog o) {
        return o.age!=age?o.age-age:o.name.compareTo(name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}