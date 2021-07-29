package com.xms.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xms.domain.Student;
import com.xms.domain.StudentListType;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.*;

/**
 * @author czw
 * @create 2021-07-26-上午 11:37
 */
public class JsonTest {
    @Test
    //JavaBean to JSONString
    public void test01(){
//        Student s = new Student("zs",11,'男',new Date());
//        //创建Gson解释器
//        Gson g = new Gson();
//        String s1 = g.toJson(s);
//        System.out.println(s1);
//        Student student = g.fromJson(s1, Student.class);
//        System.out.println(student);
    }

    @Test
    //List和json的转换
    public void test02(){
        List<Student> list = Arrays.asList(new Student("zs",11,'男',new Date()),
                new Student("ls",12,'男',new Date()),
                new Student("ww",13,'男',new Date()),
                new Student("zl",14,'男',new Date()));
        Gson g = new Gson();
        String s = g.toJson(list);
//        System.out.println(s);
        ArrayList arrayList = g.fromJson(s, ArrayList.class);
        Class rawType = new StudentListType().getRawType();
//        System.out.println(new Student());
        System.out.println(rawType);
        ArrayList l = g.fromJson(s, (Type) rawType);
        System.out.println(l);
    }
    @Test
    public void test03(){
        Map<Integer,Student> map = new HashMap<>();
        map.put(1,new Student("ls",12,'男',new Date()));
        map.put(2,new Student("zs",13,'男',new Date()));
        map.put(3,new Student("ww",14,'男',new Date()));
        Gson g = new Gson();
        String s = g.toJson(map);
        Map<Integer,Student> map1 = g.fromJson(s, new TypeToken<Map<Integer, Student>>() {}.getType());
        map1.forEach((k,v)->System.out.println(k+"-"+v.toString()));
    }
}

