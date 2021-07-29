package com.xms.day01;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.xms.day01.util.JDBCUtils;

/**
 * @author czw
 * @create 2021-07-09-下午 2:07
 */
public class JDBCDemo03 {
    public static void main(String[] args) throws ClassNotFoundException {
        String sql = "select * from user where id = 1";
        String sql1 = "select * from user where id>1";
        //把User的类对象作为参数
        User getone = getone(User.class, sql);
        System.out.println(getone);
        System.out.println("--------------------");
        List<User> more = getMore(User.class, sql1);
        more.forEach(System.out::println);

    }
    public static <T> T getone(Class<T> clazz,String sql){//将Class的实例类型作为返回值类型
        //初始化Connection对象
        Connection conn = null;
        //初始化Statement对象
        Statement state = null;
        //初始化Result对象
        ResultSet rs = null;
        try {
            //获取Connection对象
            conn = JDBCUtils.getConnection();
            //获取Statement对象
            state = conn.createStatement();
            //执行查询语句返回ResultSet对象
            rs = state.executeQuery(sql);
            //调用结果集对象的getMetaData()方法获取ResultSetMetaData对象
            ResultSetMetaData metaData = rs.getMetaData();
            //调用ResultSetMetaData对象的getColumnCount()方法获取查询数据的总列数
            int count = metaData.getColumnCount();
            //如果第一行不为空
            if(rs.next()){
                //通过反射创建Class类对象类的实例
                T t = clazz.newInstance();
                for(int i=1;i<=count;i++){
                    //获取列名
//                    String column = metaData.getColumnName(i);
                    //获取列别名
                    String columnLabel = metaData.getColumnLabel(i);
                    //获取该类对应列别名的字段
                    Field field = clazz.getDeclaredField(columnLabel);
                    //解除访问权限
                    field.setAccessible(true);
                    //给t实例设置值
                    field.set(t,rs.getObject(i));
                }
                //返回t实例
                return t;
            }
        } catch (SQLException | IllegalAccessException | InstantiationException | NoSuchFieldException e) {
            e.printStackTrace();
        }finally{
            //释放资源
            JDBCUtils.releaseResource(conn,state,rs);
        }
        //如果没有返回t实例,返回null
        return null;
    }
    public static <T> List<T> getMore(Class<T> clazz, String sql){//将Class的实例类型作为返回值类型
        List<T> list = new ArrayList<>();
        //初始化Connection对象
        Connection conn = null;
        //初始化Statement对象
        Statement state = null;
        //初始化Result对象
        ResultSet rs = null;
        try {
            //获取Connection对象
            conn = JDBCUtils.getConnection();
            //获取Statement对象
            state = conn.createStatement();
            //执行查询语句返回ResultSet对象
            rs = state.executeQuery(sql);
            //调用结果集对象的getMetaData()方法获取ResultSetMetaData对象
            ResultSetMetaData metaData = rs.getMetaData();
            while(rs.next()){
                //通过反射创建Class类对象类的实例
                T t = clazz.newInstance();
                //给实例设置值
                setTField(t,clazz,metaData,rs);
                //添加t实例
                list.add(t);
            }
            return list;
        } catch (SQLException | IllegalAccessException | InstantiationException | NoSuchFieldException e) {
            e.printStackTrace();
        }finally{
            //释放资源
            JDBCUtils.releaseResource(conn,state,rs);
        }
        //如果没有返回t实例,返回null
        return null;
    }

    private static <T> void setTField(T t, Class<T> clazz, ResultSetMetaData metaData, ResultSet rs) throws NoSuchFieldException, SQLException, IllegalAccessException {
        int count = metaData.getColumnCount();
        for(int i=1;i<=count;i++){
            //获取列名
//                    String column = metaData.getColumnName(i);
            //获取列别名
            String columnLabel = metaData.getColumnLabel(i);
            //获取该类对应列别名的字段
            Field field = clazz.getDeclaredField(columnLabel);
            //解除访问权限
            field.setAccessible(true);
            //给t实例设置值
            field.set(t,rs.getObject(i));
        }
    }
}
class User{
    private int id;
    private String name;
    private String password;
    private String address;
    private String phone;

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}