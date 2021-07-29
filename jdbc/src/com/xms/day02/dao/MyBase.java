package com.xms.day02.dao;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.*;
import java.util.List;

/**
 * @author czw
 * @create 2021-07-17-下午 2:53
 */
public class MyBase<T> {
    Class<T> clazz = null;
    {
        Type type = this.getClass().getGenericSuperclass();
        ParameterizedType pType = (ParameterizedType) type;
        Type[] typeArguments = pType.getActualTypeArguments();
        clazz = (Class<T>) typeArguments[0];
    }






    public void upDate(String sql, Connection conn,Object...objs) throws SQLException {
        PreparedStatement pS = conn.prepareStatement(sql);
        for(int i = 0;i<objs.length;i++){
            pS.setObject(i+1,objs[i]);
        }
        int i = pS.executeUpdate();
        System.out.println("一共有"+i+"行被改变");

    }
    public T queryOne(String sql,Connection conn,Object...objs) throws SQLException {
        PreparedStatement pS = null;
        try {
            T t = clazz.newInstance();
            pS = conn.prepareStatement(sql);
            for(int i = 0;i<objs.length;i++){
                pS.setObject(i+1,objs[i]);

            }
            ResultSet rs = pS.executeQuery();
            ResultSetMetaData meta = rs.getMetaData();
            int count = meta.getColumnCount();
            while(rs.next()){
                for(int i=1;i<=count;i++){
                    String label = meta.getColumnLabel(1);
                    Field field = clazz.getDeclaredField(label);
                    Object result = rs.getObject(label);
                    field.setAccessible(true);
                    field.set(t,result);
                }
            }
            return t;
        }catch(SQLException | IllegalAccessException | InstantiationException | NoSuchFieldException e){
            e.printStackTrace();
        }finally{
            pS.close();
        }

        return null;
    }
    public List<T> queryMulti(){
        return null;
    }

}
