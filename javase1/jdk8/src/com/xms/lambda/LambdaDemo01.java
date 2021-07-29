package com.xms.lambda;

/**
 * @author czw
 * @create 2021-06-25-下午 2:36
 * Lamda
 * 格式
 * (参数)->{代码语句};
 * 说明:
 * Lambda是函数式接口的某个匿名实现类对象
 * ()里面的参数表示的是函数式接口中抽象方法的参数
 * ->被用于
 * {}:函数式接口内抽象方法的重写
 *
 * 省略规则
 * Lambda体现函数式编程思想,所以凡是通过上下文能够推导的所有东西统统可以省略
 * 1)如果小括号中只有一个参数,小括号可以省略
 * 2)如果大括号中只有一句代码,可以省略大括号和;如果是return语句return可以省略
 */
@FunctionalInterface
interface Inter{
    void show(int a);
    default void add(){}

    static void func() {
    }
}
public class LambdaDemo01 {
    public static void main(String[] args) {
        Inter i1 = new Inter(){
            @Override
            public void show(int a) {
                System.out.println(a);
            }
        };
        Inter i = System.out::println;
        i.show(100);
        i1.show(10);
    }
}
