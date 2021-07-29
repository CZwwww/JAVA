package com.xms.day02;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author czw
 * @create 2021-07-10-下午 5:08
 */
public class JDBCDemo04 {
    public static void main(String[] args) throws SQLException {
        DBCPUtils.getConnection().close();
        System.out.println();
    }
}
class DBCPUtils{
    private static DataSource ds;
    static{
        Properties pro = new Properties();
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("dbcp.properties");
        try {
            pro.load(is);
            ds = BasicDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}