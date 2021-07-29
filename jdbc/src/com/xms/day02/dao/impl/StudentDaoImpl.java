package com.xms.day02.dao.impl;

import com.xms.day02.JDBCDemo03;
import com.xms.day02.dao.BaseDao;
import com.xms.day02.dao.StudentDao;
import com.xms.day02.domain.Student;

import java.sql.Connection;
import java.util.List;

/**
 * @author czw
 * @create 2021-07-10-上午 11:38
 */
public class StudentDaoImpl extends BaseDao<Student> implements StudentDao {
    public StudentDaoImpl() {
//        name = "impl";
//        System.out.println(this.name);
    }

    @Override
    public void insert(Connection conn, Student stu) {
        String sql = "Insert into Student values(?,?,?)";
        Object[] objs = {stu.getId(),stu.getName(),stu.getAge()};
        updateTx(conn,sql,objs);
    }

    @Override
    public void deleteByid(Connection conn, int id) {
        String sql = "delete from student where id =?";
        updateTx(conn,sql,id);
    }

    @Override
    public void update(Connection conn, Student stu) {
        String sql = "update student set ? = ? where ? = ? ";
        updateTx(conn,sql,stu.getName(),stu.getName(),stu.getId(),stu.getId());
    }

    @Override
    public Student getStudent(Connection conn, Object... objs) {
        return queryOne(conn,"select * from student where id=? and name = ? and age =? ",objs);
    }

    @Override
    public List<Student> getAllStudents(Connection conn) {
        return queryMore(conn,"select * from student");
    }

    @Override
    public Long getCount(Connection conn) {
        return findSingle(conn,"select count(*) from student");
    }

    @Override
    public int getMaxAge(Connection conn) {
        return findSingle(conn,"select max(age) from student");
    }
}
