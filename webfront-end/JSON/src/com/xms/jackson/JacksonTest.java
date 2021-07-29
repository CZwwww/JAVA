package com.xms.jackson;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xms.domain.Student;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author czw
 * @create 2021-07-26-下午 2:35
 */
public class JacksonTest {
    @Test
    public void test() throws IOException {
        Student s = new Student("ls", 12, '男', new Date());
        ObjectMapper om = new ObjectMapper();
        String string = om.writeValueAsString(s);
        System.out.println(string);
//        om.writeValue(new File("1.txt"),s);
        Student student = om.readValue(new File("1.txt"), Student.class);
        System.out.println(student);


    }
    @Test
    public void test01() throws IOException {
        List<Student> list = Arrays.asList(new Student("ls", 12, '男', new Date()),
                new Student("zs", 13, '男', new Date()),
                new Student("ww", 14, '男', new Date()),
                new Student("zl", 15, '男', new Date()));
        ObjectMapper om = new ObjectMapper();
        String string = om.writeValueAsString(list);
        System.out.println(string);
        List<Student> list1 = om.readValue(string, new TypeReference<List<Student>>() {
        });
        list1.forEach(System.out::println);

    }
}
