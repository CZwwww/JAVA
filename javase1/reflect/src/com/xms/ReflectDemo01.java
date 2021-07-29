package com.xms;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;

/**
 * 获取Class实例的方式
 * @author czw
 * @create 2021-06-23-下午 4:42
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class stu1 = Student.class;

        Class stu2 = new Student("张三",18).getClass();
        //推荐使用
        Class stu3 = Class.forName("com.xms.Student");
        //通过类加载器获取
        ClassLoader cl = ReflectDemo01.class.getClassLoader();
        Class<?> clazz = cl.loadClass("com.xms.Student");
        System.out.println(stu1==stu2&&stu3==clazz);//t


        Constructor con = clazz.getConstructor(java.lang.String.class,int.class);
        System.out.println(con);
        Constructor[] cons = clazz.getDeclaredConstructors();
        //取消java语言检查机制,使得外界可以访问private修饰的成员
        cons[0].setAccessible(true);
        Student stu = (Student) cons[0].newInstance();
        System.out.println(Arrays.toString(cons));


        Method[] methods = clazz.getDeclaredMethods();
        Method method2 = clazz.getDeclaredMethod("show");
        method2.setAccessible(true);
        method2.invoke(stu);
        Class<?>[] exceptionTypes = method2.getExceptionTypes();
        System.out.println(exceptionTypes[0]);
        Annotation[] declaredAnnotations1 = methods[0].getDeclaredAnnotations();
        System.out.println(Arrays.toString(declaredAnnotations1));
        Annotation[] declaredAnnotations = methods[0].getDeclaredAnnotations();
        System.out.println(declaredAnnotations[0]);

        Field[] declaredFields = clazz.getDeclaredFields();

        Class<son1> clazz1 = son1.class;
        Type genericSuperclass = clazz1.getGenericSuperclass();
        ParameterizedType p = (ParameterizedType)genericSuperclass;
        System.out.println(Arrays.toString(clazz1.getInterfaces()));
        System.out.println(p);

    }
}
class father<T> {}
class son<T> extends father<T>{}
class son1 extends father<String>implements inter1,inter2{}
interface inter1{}
interface inter2{}