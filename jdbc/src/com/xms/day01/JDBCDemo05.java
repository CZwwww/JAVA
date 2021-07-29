package com.xms.day01;

import com.xms.day01.util.JDBCUtils;
import sun.applet.Main;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author czw
 * @create 2021-07-09-下午 4:19
 */
public class JDBCDemo05 {
    public static void main(String[] args) throws SQLException {
//        String sql = "update account set name =? where id =?";
//        update(sql,"zwj",3);
        String sql2 = "select *from user where id>=?";
        User zzy = query(sql2, User.class, "章子怡");
        System.out.println(zzy);
        List<User> userList = queryMore(sql2, User.class, 1);
        userList.forEach(System.out::println);
    }
    public static void update(String sql,Object...objs) throws SQLException {
        Connection conn = JDBCUtils.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        for(int i=0;i<objs.length;i++) {
            ps.setObject(i + 1, objs[i]);
        }
        int i = ps.executeUpdate();
        if(i>0){
            System.out.println("插入成功,改变了"+i+"行数据");
        }else{
            System.out.println("改变失败");
        }
        JDBCUtils.releaseResource(conn,ps);
    }
    public static <T> T query(String sql,Class<T> clazz,Object...objs) throws SQLException {
        Connection conn = JDBCUtils.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        for(int i=0;i<objs.length;i++) {
            ps.setObject(i + 1, objs[i]);
        }
        ResultSet rs = ps.executeQuery();
        ResultSetMetaData metaData = rs.getMetaData();
        int count = metaData.getColumnCount();
        if(rs.next()){
            try {
                T t = clazz.newInstance();
                for(int i=1;i<=count;i++){
                    String columnLabel = metaData.getColumnLabel(i);
                    Field field = clazz.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(t,rs.getObject(i));
                }
                return t;
            } catch (InstantiationException | IllegalAccessException | NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
        JDBCUtils.releaseResource(conn,ps,rs);
        return null;
    }

    public static <T> List<T> queryMore(String sql, Class<T> clazz, Object...objs){
        List<T> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            conn = JDBCUtils.getConnection();
            //获取预编译语句对象
            ps = conn.prepareStatement(sql);
            //匹配sql中所有的?
            for(int i=0;i<objs.length;i++){
                ps.setObject(i+1,objs[i]);
            }
            //执行查询语句
            rs = ps.executeQuery();
            //获取元数据
            ResultSetMetaData metaData = rs.getMetaData();
            //获取表列数
            int count = metaData.getColumnCount();
            //遍历结果集
            while(rs.next()){
                //创建类对象实例
                T t = clazz.newInstance();
                //遍历列
                for(int i=1;i<=count;i++){
                    //获取列别名
                    String columnLabel = metaData.getColumnLabel(i);
                    //根据别名获取字段
                    Field field = clazz.getDeclaredField(columnLabel);
                    //关闭java的编译检查机制
                    field.setAccessible(true);
                    //设置字段值为该列查询结果
                    field.set(t,rs.getObject(i));
                }
                //将该对象加入列表
                list.add(t);
            }
            //返回列表
            return list;
        }catch (SQLException | InstantiationException | IllegalAccessException | NoSuchFieldException e){
            e.printStackTrace();
        }finally{
            //释放资源
            JDBCUtils.releaseResource(conn,ps,rs);
        }
        return null;
    }
}
