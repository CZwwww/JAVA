package com.xms.day02.test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * @author czw
 * @create 2021-07-12-上午 9:15
 */
public class JDBCUtil {
    private static Connection conn = null;
    private static String url = null;
    private static String username = null;
    private static String password = null;
    private static String driverClass = null;
    static{
         try {
             ClassLoader scl = ClassLoader.getSystemClassLoader();
             InputStream is = scl.getResourceAsStream("jdbc.properties");
             Properties pro = new Properties();
             pro.load(is);
             url = pro.getProperty("url");
             username = pro.getProperty("username");
             password = pro.getProperty("password");
             driverClass = pro.getProperty("driverClass");
             scl.loadClass(driverClass);

         } catch (ClassNotFoundException | IOException | NullPointerException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,username,password);
    }
    public static void releaseSource(Connection conn, Statement stat, ResultSet rs){
        if(conn == null)
            return;
        try {
            conn.close();
            stat.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
