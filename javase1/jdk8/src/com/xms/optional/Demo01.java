package com.xms.optional;

import org.junit.Test;

import java.util.Optional;

/**
 * 容器类,可以用来存储一个对象,也可以用来表示一个对象是否存在
 * 之前我们使用null表示对象不存在,但是会引发空指针异常
 * 现在使用Optional可以避免空指针异常.
 * @author czw
 * @create 2021-06-28-下午 5:33
 */
public class Demo01 {
    @Test
    public void test(){
        //1)of(T):通过T获取Optional
        Optional<String> op = Optional.of("hello");
        //如果s为null则发生空指针异常
        System.out.println(op.get());
//        Optional<Object> empty = Optional.empty();
//        System.out.println(empty.get());/

        //3)static ofNullable(T),如果T为null,获取一个空的Optional
        String s = null;
        Optional<String> op3 = Optional.ofNullable(s);
        if(op3.isPresent()){

        }else{
            String s1 = op3.orElse("javase");
            System.out.println(s);

        }
        Optional<Object> op4 = op3.map(String::toUpperCase);
        System.out.println(op4.get());

        Optional<String> op5 = op3.flatMap(a -> Optional.ofNullable(a.toUpperCase()));
        System.out.println(op5.get());


    }
}
