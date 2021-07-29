package com.xms.pattern.strategy;

/**
 * @author czw
 * @create 2021-06-23-下午 4:12
 */
public class AgePredicate implements MyPredicate{
    Employee emp;



    @Override
    public boolean test(Employee emp) {
        return emp.age<25;
    }//断言型接口实现类

}
