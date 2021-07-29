package com.xms.Stream;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author czw
 * @create 2021-06-28-下午 2:35
 */
public class Demo04 {
    List<Employee> list;
    @Before
    public void init(){
        list = new ArrayList<>();
        list.add(new Employee("Tom",7000,Status.FREE));
        list.add(new Employee("Tony",5000,Status.BUSY));
        list.add(new Employee("Tomas",6000,Status.BUSY));
        list.add(new Employee("Jerry",8000,Status.VOCATION));
        list.add(new Employee("Lucy",9000,Status.BUSY));
    }
    @Test
    public void test(){
        boolean b = list.stream().allMatch(e -> Status.BUSY.equals(e.status));
        System.out.println(b);
        boolean b1 = list.stream().anyMatch(e -> Status.VOCATION.equals(e.status));
        System.out.println(b1);
        boolean b2 = list.stream().noneMatch(e -> Status.BUSY.equals(e.status));
        System.out.println(b2);


    }
    @Test
    public void test1(){
        Optional<Employee> op = list.stream().findFirst();
        Optional<Employee> op1 = list.stream().findAny();//注意此方法要想获取任意元素需要是并行流
        selectAny();
        selectAny();

    }
    @Test
    public void test2(){
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        Integer reduce = list1.stream().reduce(0, Integer::sum);
        System.out.println(reduce);
        Optional<Double> reduce1 = list.stream().map(e -> e.salary).reduce(Double::sum);
        System.out.println(reduce1.get());
    }
    @Test
    public void test3(){
        //将收集到的元素转成集合
        List<String> collect = list.stream().map(e -> e.name).collect(Collectors.toList());
        System.out.println(collect);
        ArrayList<Status> collect1 = list.stream()
                .map(e -> e.status)
                .collect(Collectors
                        .toCollection(ArrayList::new));
        HashSet<String> collect2 = list.stream().map(e -> e.name).collect(Collectors.toCollection(HashSet::new));
        System.out.println(collect2);
    }

    @Test
    public void test4(){
        long count = list.stream().filter(e -> e.salary > 5000).count();
        list.stream().collect(Collectors.averagingDouble(e->e.salary));
        list.stream().mapToDouble(e -> e.salary).sum();
        Optional<Double> max = list.stream().map(e -> e.salary).collect(Collectors.maxBy(Double::compare));
        System.out.println(max.get());
        //summarizingDouble获取所有汇总信息
        DoubleSummaryStatistics collect = list.stream().collect(Collectors.summarizingDouble(e -> e.salary));
        System.out.println(collect.getMax());
        System.out.println(collect.getAverage());
        System.out.println(collect.getCount());
        System.out.println(collect.getSum());
        //分组
        Map<Status, List<Employee>> ma = list.stream().collect(Collectors.groupingBy(e -> e.status));
        ma.forEach((k,v)->{
            System.out.println(k);
            v.forEach(System.out::println);
        });
        Map<Status, Map<String, List<Employee>>> collect1 = list.stream().collect(Collectors.groupingBy(e -> e.status,
                Collectors.groupingBy(e -> {
                    if (e.salary < 5000) {
                        return "普工";
                    } else if (e.salary < 8000) {
                        return "技工";
                    } else {
                        return "高工";
                    }
                })));
        collect1.forEach((k,v)->{
            System.out.println(k);
            v.forEach((x,y)->{
                System.out.println('\t'+x);
                y.forEach(System.out::println);
            });
        });
        //分区
        //工资>=8000一个区,<8000一个区
        Map<Boolean, List<Employee>> collect2 = list.stream().collect(Collectors.partitioningBy(e -> e.salary >= 8000));
        collect2.forEach((k,v)->{
            System.out.println(k?">=8000":"<8000");
            v.forEach(System.out::println);
        });
        //连接
        //将所有员工姓名进行连接
        String collect3 = list.stream().map(e
                -> e.name).collect(Collectors.joining());
        System.out.println(collect3);

        String collect4 = list.stream().map(e
                -> e.name).collect(Collectors.joining(",","<<",">>"));
        System.out.println(collect4);
    }

    private void selectAny() {
        Optional<Employee> op3 = list.stream().filter(e -> Status.BUSY.equals(e.status)).findAny();
        System.out.println(op3.get());
        long count = list.stream().filter(e -> Status.BUSY.equals(e.status)).count();
//        System.out.println(op4.get());
        System.out.println(count);

    }
}
