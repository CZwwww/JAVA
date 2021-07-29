package com.xms.day02.dao;

import com.xms.day02.domain.Student;

import java.sql.Connection;
import java.util.List;

/**
 * @author czw
 * @create 2021-07-10-上午 11:31
 */
public interface StudentDao {
    void insert(Connection conn, Student stu);
    void deleteByid(Connection conn,int id);
    void update(Connection conn,Student stu);
    Student getStudent(Connection conn ,Object...objs);
    List<Student> getAllStudents(Connection conn);
    Long getCount(Connection conn);
    int getMaxAge(Connection conn);
}
