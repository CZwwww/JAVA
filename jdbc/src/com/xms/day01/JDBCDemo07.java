package com.xms.day01;

import com.xms.day01.util.JDBCUtils;

import java.io.*;
import java.sql.*;
import java.util.Date;

/**
 * 操作blob数据
 * @author czw
 * @create 2021-07-09-下午 5:31
 */
public class JDBCDemo07 {
    public static void main(String[] args) throws Exception {
//        insertBlob();
        queryBlob();
    }

    //插入blob数据
    public static void insertBlob() throws Exception {
        Connection conn = JDBCUtils.getConnection();
        String sql = "insert into  customers values(?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setObject(1,19);
        ps.setObject(2,"达芬奇");
        ps.setObject(3,"davenci@163.com");
        ps.setObject(4,"1933-01-02");
        ps.setBlob(5,new FileInputStream("C:\\Users\\Administrator\\Desktop\\paint.png"));
        int resultSet = ps.executeUpdate();
        System.out.println(resultSet);
        JDBCUtils.releaseResource(conn,ps);
    }
    public static void queryBlob() throws Exception {
        Connection conn = JDBCUtils.getConnection();
        String sql = "select * from customers where id =?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setObject(1,19);
        ResultSet resultSet = ps.executeQuery();
        if(resultSet.next()){
            Date birth = resultSet.getDate("birth");
            Blob image = resultSet.getBlob("photo");
            InputStream is = image.getBinaryStream();
            OutputStream os = new FileOutputStream("image.png");
            System.out.println(birth);
            byte[] buf = new byte[1024];
            int len = -1;
            while ((len = is.read(buf))!=-1){
                os.write(buf,0,len);
            }
        }

        JDBCUtils.releaseResource(conn,ps,resultSet);
    }
}
