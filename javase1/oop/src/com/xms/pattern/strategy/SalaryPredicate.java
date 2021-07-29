package com.xms.pattern.strategy;

/**
 * @author czw
 * @create 2021-06-23-下午 4:14
 */
public class SalaryPredicate implements MyPredicate {

    @Override
    public boolean test(Employee emp) {
        return emp.salary<7000;
    }
}
