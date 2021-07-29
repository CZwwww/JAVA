package com.xms.day02;

import com.xms.day01.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author czw
 * @create 2021-07-10-上午 10:20
 */
public class JDBCDemo03 {
    public static void main(String[] args) {
        String sql = "update account set money=money-? where id=?";
        String sql2 = "update account set money=money+? where id=?";
    }

    public static void updateTx(Connection conn,Supplier<String[]> sql, Object[]...objArrs) {
        PreparedStatement ps = null;
        try{
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);
            for(int i=0;i<sql.get().length;i++) {
                ps = conn.prepareStatement(sql.get()[i]);
                for (int j = 0; j < objArrs[i].length; j++) {
                    ps.setObject(j + 1, objArrs[i][j]);
                }
                ps.executeUpdate();
            }
            conn.commit();
        }catch (SQLException e){
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }finally{
            JDBCUtils.releaseResource(null,ps);
        }
    }
    private <T> List<T>[] findMore(Supplier<String[]> sql,Class<T> clazz,Object[]...objArrs){
        return null;
    }
}
