package com.xms.day01;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author czw
 * @create 2021-06-08-下午 4:58
 */
public class ObjectDemo01 {
    public static void main(String[] args) {
        Student s1 = new Student();
//        Student s2 = new Student("ls",12);
//        Student s3 = new Student("ls",12);
//        Class c1 = s1.getClass();
//        Class c2 = s2.getClass();
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c1==c2);
//        //默认返回的是对象的地址值信息,不符合我们的要求,所以需要重写
//        int h1 = s1.hashCode();
//        int h2 = s2.hashCode();
//        int h3 = s3.hashCode();
//        System.out.println(h1==h2);
//        System.out.println(h2==h3);
//        s1.testString();
        String str = "abcdefg";
        String str1 = "people";
        String str2 = "a";
        String c[ ] = {"p","e","o","p","l","e"};
//        Number number = Integer.parseInt(str);
//        System.out.println(number.toString());
//        str = str.substring(2,5);
//        System.out.println(str);
        System.out.println(str1.equals(c));
//        String s = str.toLowerCase();
//        str+="pepepepe";
//        System.out.println(str);
        String s[ ] = new String[5];
        for(int i=0;i<5;s[i++]="");
        System.out.println(Arrays.toString(s));
        s1.change(s1.name,s1.ch);
        System.out.println(s1.name);
        System.out.println(s1.ch);
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.delete(1,2);
        System.out.println(stringBuffer);
    }
}
class Student{
    String name = "Girl";
    int age;
    char[] ch = {'d','b','c'};

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        //如果两个对象的哈希值不等,那么这两个对象一定不等
        //如果两个对象的哈希值相等,这两个对象有较低概率不等
        //一般我们通过哈希值粗略判断两个对象是否相等
        //如果算法比较简单,出现两个对象不等但哈希值相等的概率会变高
        return Objects.hash(name, age);
    }
//    public void testString(){
//        String str1 = "学码思";
//        String str2 = "学码思";
//        String str3 = new String("学码思");
//        System.out.println(str1 == str2);//true
//        System.out.println(str1 == str3);//false
//        System.out.println(str1.equals(str3));//false
//        str1 = "学码思xuemasi.com";
//        String str4 = "xuemasi.com";
//        String str5 = "学码思" + "xuemasi.com";
//        System.out.println(str1 == str5);//true
//        String str6 = (str2 + str4).intern();
//        System.out.println(str6);
//        System.out.println(str1 == str6);
//        System.out.println(Math.round(-11.5));
//    }
    public String toString(){
        return "name:"+name+",age"+age;
    }

    public void change(String str,char[] ch){
        str = "Boy";
        ch[0] = 'a';
    }
}