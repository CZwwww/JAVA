package com.xms.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author czw
 * @create 2021-06-24-上午 11:56
 */
public class DynamicDemo {
    public static void main(String[] args) {
        Object o = getProxyInstance(new Fd());
        Deal d = (Deal)o;
        d.sale(100);
    }
    private static Object getProxyInstance(Deal d){
        Class clazz = d.getClass();
        ClassLoader classLoader = clazz.getClassLoader();
        return Proxy.newProxyInstance(classLoader, clazz.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("中介将房源挂到网上");
                return method.invoke(clazz.newInstance(), args);
            }
        });
    }
}
interface Deal{
    void sale(double money);
}
class Fd implements Deal{
    @Override
    public void sale(double money) {
        System.out.println("房东房子房价"+money);
    }
}
