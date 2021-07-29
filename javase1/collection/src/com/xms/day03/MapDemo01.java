package com.xms.day03;

import java.util.HashMap;

/**
 *     2、使用Map接口的实现类完成员工工资(姓名--工资)的摸拟：
 *             1)添加几条信息
 * 2)列出所有的员工姓名
 * 3列出所有员工姓名及其工资
 * 4)删除名叫“Tom”的员工信息
 * 5)输出Jack的工资，并将其工资加1000元(通过取值实现)
 * 6)将所有工资低于1000元的员工的工资上涨20%(通过取值实现)
 * @author czw
 * @create 2021-06-16-上午 9:18
 */
public class MapDemo01 {
    public static void main(String[] args) {
        HashMap<String,Double> EmpTable = new HashMap<>();
        EmpTable.put("tom", 3000.0);
        EmpTable.put("jack",4000.0);
        EmpTable.put("jerry",500.0);
        EmpTable.remove("tom");
        System.out.println(EmpTable.get("jack"));
        EmpTable.put("jack",EmpTable.get("jack")+1000);
        EmpTable.forEach((s, aDouble) -> {
            if(aDouble<1000){
                EmpTable.replace(s,1.2*aDouble);
            }
        });
        EmpTable.forEach((s, aDouble) -> System.out.println("name:"+s+",salary:"+aDouble));
    }
}
