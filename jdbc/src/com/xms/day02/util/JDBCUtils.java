package com.xms.day02.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * 自定义JDBC工具类
 * @author czw
 * @create 2021-07-09-上午 10:36
 */
public class JDBCUtils {
    private static String url;
    private static String user;
    private static String password;
    private static String driverClass;
    private static String properties = "jdbc.properties";
    static{
        InputStream resourceAsStream = JDBCUtils.class.getClassLoader().getResourceAsStream(properties);
        Properties p = new Properties();
        try {
            p.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        url = p.getProperty("url");
        user = p.getProperty("user");
        password = p.getProperty("password");
        driverClass = p.getProperty("driver");
        try {
            Class.forName(driverClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }
    public static void releaseResource(Connection conn, Statement stat){
        if(conn!=null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(stat!=null) {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void releaseResource(Connection conn, Statement stat, ResultSet rs){
        releaseResource(conn,stat);
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
