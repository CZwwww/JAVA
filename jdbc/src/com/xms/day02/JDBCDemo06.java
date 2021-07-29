package com.xms.day02;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author czw
 * @create 2021-07-10-下午 5:37
 */
public class JDBCDemo06 {
    public static void main(String[] args) throws SQLException {
        System.out.println(DruidUtils.getConnection());
    }
}
class DruidUtils{
    private static DataSource source ;
    static{
        Properties pro = new Properties();
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");
        try {
            pro.load(is);
            source = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        return source.getConnection();
    }
}
