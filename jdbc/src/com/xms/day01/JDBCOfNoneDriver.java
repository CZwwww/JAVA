package com.xms.day01;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author czw
 * @create 2021-07-17-上午 11:05
 */
public class JDBCOfNoneDriver {
    public static void main(String[] args) throws SQLException, InterruptedException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
//        System.gc();
//        Thread.sleep(10000);
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1234");
//        System.out.println(conn);
        List<Student> list = new ArrayList<>();
        //获取语句对象
        Statement statement = conn.createStatement();
        //获取结果集对象
        ResultSet res = statement.executeQuery("select * from student where id>1");
        //获取结果集的元数据对象
        ResultSetMetaData meta = res.getMetaData();
        //获取类对象
        Class<?> clazz = Student.class;
        //获取列数目
        int columnCount = meta.getColumnCount();
        //句柄转移到第一行
        while (res.next()) {
            //创建Student对象
            Student stu = (Student) clazz.newInstance();
            for (int i = 0; i < columnCount; i++) {
                //获取第一列别名
                String columnLabel = meta.getColumnLabel(i+1);
                //获取第一列数据
                Object obj = res.getObject(i+1);
                //获取第一列别名对应的字段属性
                Field field = clazz.getDeclaredField(columnLabel);
                //取消java编译时对权限修饰符的检查
                field.setAccessible(true);
                //设置stu的属性
                field.set(stu, obj);
            }
            //把stu添加进列表
            list.add(stu);
        }
        //遍历结果
        list.forEach(System.out::println);
    }
}
class Student{
    int id;
    int age;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}