package com.xms.pattern.strategy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author czw
 * @create 2021-06-23-下午 3:51
 */
public class EmpTest {
    @Test
    public void test(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("张三",33,6000));
        list.add(new Employee("李四",31,9000));
        list.add(new Employee("王五",35,15000));
        list.add(new Employee("赵六",22,5000));
        list.add(new Employee("田七",25,8000));
        myFilter(list, employee -> employee.salary<7000);
        System.out.println("-----------------------------------------------");
        myFilter(list, employee -> employee.age>25);
    }

    private void myFilter(List<Employee> list, Predicate<Employee> p) {
        list.forEach(employee -> {
            if(p.test(employee)){
                System.out.println(employee);
            }
        });
    }
}
