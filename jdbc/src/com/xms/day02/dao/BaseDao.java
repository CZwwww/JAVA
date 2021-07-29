package com.xms.day02.dao;

import com.xms.day01.util.JDBCUtils;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author czw
 * @create 2021-07-10-下午 2:13
 */
public class BaseDao<T> {

    Class<T> clazz = null;
//    protected String name = "Base";
    {
        //获取带有泛型的父类运行时类对象
        Type type = this.getClass().getGenericSuperclass();
        //将其转为参数化类型
        ParameterizedType pt = (ParameterizedType)type;
        //获取其实际类型参数列表
        Type[] ata = pt.getActualTypeArguments();
        clazz = (Class<T>)ata[0];
//        System.out.println("baseDao");//测试构造代码块何时执行
//        System.out.println(this.name);
    }
    public  List<T> queryMore(Connection conn,String sql, Object...objs){
        List<T> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
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
            JDBCUtils.releaseResource(null,ps,rs);
        }
        return null;
    }
    public  T queryOne(Connection conn,String sql, Object...objs){
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
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
            if(rs.next()){
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
                return t;
            }
        }catch (SQLException | InstantiationException | IllegalAccessException | NoSuchFieldException e){
            e.printStackTrace();
        }finally{
            //释放资源
            JDBCUtils.releaseResource(null,ps,rs);
        }
        return null;
    }
    public <E> E findSingle(Connection conn,String sql,Object...objs){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            for(int i=0;i<objs.length;i++){
                ps.setObject(i+1,objs[i]);
            }
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return (E)rs.getObject(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void updateTx(Connection conn, String sql, Object...objs) {
        PreparedStatement ps = null;
        try{
            conn.setAutoCommit(false);
            ps = conn.prepareStatement(sql);
            for(int i=0;i<objs.length;i++){
                ps.setObject(i+1,objs[i]);
            }
            ps.executeUpdate();
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
            try {
                conn.setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
