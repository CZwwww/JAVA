package com.xms.day02;

import com.xms.day01.util.JDBCUtils;
import com.xms.day02.domain.Student;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;

/**
 * DBUtils的使用
 * @author czw
 * @create 2021-07-10-下午 5:47
 */
public class JDBCDemo07 {
    Connection conn = null;
    QueryRunner qr = new QueryRunner();
    @Before
    public void init() throws SQLException {
        conn = JDBCUtils.getConnection();
    }
    @Test
    public void insertTest() throws SQLException {

        String sql = "insert into student values(?,?,?)";
        qr.update(conn,sql,7,"小王",19);
    }
    @Test
    public void deleteTest() throws SQLException {
        String sql = "delete from student where id =?";
        qr.update(conn,sql,5);

    }
    @Test
    public void updateTest() throws SQLException {
        String sql = "update Student set name=? where id=?";
        qr.update(conn,sql,"李四",3);
    }
    @Test
    public void selectTest() throws SQLException {
//        String sql = "select * from student where id = ?";
//        Student stu = qr.query(conn, sql, new BeanHandler<Student>(Student.class), 3);
//        System.out.println(stu);
        String sql2 ="select* from student where id>?";
        List<Student> list = qr.query(conn, sql2, new BeanListHandler<Student>(Student.class), 1);
        list.forEach(System.out::println);

    }

}
