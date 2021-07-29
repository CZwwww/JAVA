package com.xms.lambda;



/**
 * Lambda的延迟执行
 * @author czw
 * @create 2021-06-25-下午 4:37
 */
@FunctionalInterface
interface MessageBulider{
    String append();
}
public class LambdaDemo04 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        //当lev条件不满足的时候,还是要执行s1+s2
        log("2",s1+s2);
        //第二个计算需要的参数由Lambda提供,只有当lev满足条件,才会执行append()才会执行lambda
        log2("1",()->s1+s2);
    }
    private static void log(String lev, String s){
        if("1".equals(lev)){
            System.out.println(s);
        }
    }
    private static void log2(String lev, MessageBulider m){
        if("1".equals(lev)){
            System.out.println(m.append());
        }
    }
}
