package com.xms.day02;

import com.xms.day01.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author czw
 * @create 2021-07-10-上午 9:49
 */
public class JDBCDemo02 {


    public static void main(String[] args)throws Exception {
//        demo01();
            demo02();
    }


    private static void demo01() throws SQLException {
        Connection conn = JDBCUtils.getConnection();
        Statement stat = conn.createStatement();
        for(int i =0;i<100;i++){
            String sql = "insert into account(name,money) values('tom',"+i+")";
//            System.out.println(sql);
            boolean execute = stat.execute(sql);
        }
        JDBCUtils.releaseResource(conn,stat);
    }

    private static void demo02() throws SQLException {
        Connection conn = JDBCUtils.getConnection();
        String sql = "insert into account(name,money) values(?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);

        long begin = System.currentTimeMillis();
        conn.setAutoCommit(false);
        for(int i =0;i<10000;i++){
            ps.setObject(1,"tom");
            ps.setDouble(2,i);
//            System.out.println(sql);
            //添加到批处理操作
            ps.addBatch();
            if(i%500==0){
                //执行批处理操作
                ps.executeBatch();
                //清空批处理操作
                ps.clearBatch();
            }
        }
        conn.commit();
        long end = System.currentTimeMillis();
        System.out.println(end-begin);

        JDBCUtils.releaseResource(conn,ps);
    }
    //PreparedStatement批量操作

}
