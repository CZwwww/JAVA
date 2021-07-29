package com.xms.day02.test;

import com.xms.day02.dao.impl.StudentDaoImpl;
import com.xms.day02.domain.Student;
import com.xms.day02.util.JDBCUtils;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author czw
 * @create 2021-07-10-上午 11:47
 */
public class StudentDaoTest {
    Connection conn = null;
    StudentDaoImpl sd = null;
    @Before
    public void init()  {
        sd = new StudentDaoImpl();
        try {
                conn = JDBCUtils.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    @Test
    public void insertTest(){

        sd.insert(conn,new Student(5,"张无忌",18));


    }
    @Test
    public void queryTest(){
        List<Student> allStudents = sd.getAllStudents(conn);
        allStudents.forEach(System.out::println);
    }
}
