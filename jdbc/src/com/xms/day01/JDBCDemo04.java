package com.xms.day01;

import com.xms.day01.util.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.chrono.MinguoChronology;

/**
 * @author czw
 * @create 2021-07-09-下午 3:47
 */
public class JDBCDemo04 {
    public static void main(String[] args) {
        System.out.println(login("章子怡","qwerty"));
        System.out.println(login("章子怡","123'or'1'='1"));

    }
    public static boolean login(String username,String password){
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try{
            conn = JDBCUtils.getConnection();
            stat = conn.createStatement();
            rs = stat.executeQuery("select * from user where name="+"\'"+username+"\'"+"and password="+"\'"+password+"\'");
            return rs.next();

        }catch (SQLException s){
            s.printStackTrace();
        }
        return false;
    }
}
