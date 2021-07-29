package com.xms.day01;

//import com.mysql.jdbc.Driver;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *获取数据库连接
 * @author czw
 * @create 2021-07-09-上午 10:05
 */
public class JDBCdemo01 {
    public static void main(String[] args) throws SQLException, IOException {
        demo1();
//        demo2();
    }

    private static void demo2() throws IOException, SQLException {
        //读取jdbc properties
        InputStream resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
//        String driverClass = properties.getProperty("driverClass");
        String url = properties.getProperty("url");
//        System.out.println(url);
        String name = properties.getProperty("username");
//        System.out.println(name);
        String password = properties.getProperty("password");
        //加载驱动
        Connection connection = DriverManager.getConnection(url, name, password);
        System.out.println(connection);
    }

     static void demo1() throws SQLException {
        System.gc();
        //加载驱动
//        DriverManager.registerDriver(new Driver());
        //获取连接
        String url = "jdbc:mysql://localhost:3306/myemployees";
        Connection connection = DriverManager.getConnection(url, "root", "1234");
        System.out.println(connection);
    }
}
