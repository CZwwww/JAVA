package com.xms.day02;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 通过c3p0获取连接
 * @author czw
 * @create 2021-07-10-下午 5:20
 */
public class JDBCDemo05 {
    public static void main(String[] args) throws SQLException {
        System.out.println(C3P0Utils.getConnection());
    }
}
class C3P0Utils{
    private static ComboPooledDataSource cpds = new ComboPooledDataSource();
    public static Connection getConnection() throws SQLException {
        return cpds.getConnection();
    }
}