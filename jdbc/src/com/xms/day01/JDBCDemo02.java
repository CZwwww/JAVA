package com.xms.day01;

import com.xms.day01.util.JDBCUtils;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 使用Statement实现crud
 * @author czw
 * @create 2021-07-09-上午 11:22
 */
public class JDBCDemo02 {
    public static void main(String[] args) throws SQLException {
//        Class<?> aClass = JDBCDemo02.class.getClassLoader().loadClass("com.xms.day01.util.JDBCUtils");
//        Method met = aClass.getMethod("releaseResource", Connection.class, Statement.class);
//        System.out.println(met.getName());
//        updatedemo("delete from user where id = 1");

//        System.out.println(resultSet);
        ResultSet resultSet = selectDemo("select * from employees");
        if(resultSet.next()) {
            int anInt = resultSet.getInt(1);
            System.out.println(anInt);
        }

    }

    private static void updatedemo(String sql) {
        Connection connection = null;
        Statement state = null;
        try {
             connection = JDBCUtils.getConnection();
             state = connection.createStatement();
             state.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            JDBCUtils.releaseResource(connection,state);
        }
    }
    private static ResultSet selectDemo(String sql) {
        Connection connection = null;
        Statement state = null;
        try {
            connection = JDBCUtils.getConnection();
            state = connection.createStatement();
            return state.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
//            JDBCUtils.releaseResource(connection,state);
        }
        return null;
    }
}
