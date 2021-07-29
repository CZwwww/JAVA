package com.xms.test;

import org.junit.Test;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * String = "张三丰,22"
 * 将字符串截取获取年龄部分的字符串
 * 将年龄字符串转为int
 * 将上一步获取的年龄加10
 *
 *
 *
 *
 *
 *
 *

 *
 * @author czw
 * @create 2021-06-29-上午 9:37
 */
public class Test01 {
    @Test
    public void test(){
        String s = "张三丰,22";
        operate(s);
        operate1("张三,男");
        List<String> list2 = Arrays.asList("张三丰", "张磊", "张无忌", "张角", "王老五", "赵老六");
        operate3(list2,list2);
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list1 = operate4(list);
        System.out.println(list1);
        int i = operate5(list1.stream());
        System.out.println(i);
    }
    public int operate(String s){
        String[] split = s.split(",");
        String s1 = split[split.length - 1];
        int i = Integer.parseInt(s1);
        return i+10;
    }
    private int operfunc(Function<String,String> f1, Function<String,Integer> f2, Function<Integer,Integer> f3,String str){
        return f1.andThen(f2).andThen(f3).apply(str);
    }
    private void operate1(String s){
        String[] split = s.split(",");
        String s1 = "name:" + split[0] + "sex:" + split[1];
        System.out.println(s1);
    }
    private void operFunc2(BiConsumer<String,String> bc, String str){
        String[] split = str.split(",");
        bc.accept(split[0],split[1]);
    }
    private List<String> operate2(String[] sArr, BiPredicate<Integer,String> bp){
        List<String> list = new ArrayList<>();
        for (String s : sArr) {
            String[] split = s.split(",");
            if(bp.test(split[0].length(),split[1]));
            list.add(split[0]);
        }
        return list;
    }
    /**
     * 两个list集合
     *  * 第一个集合只要三个字的姓名,且只要前三个
     *  * 第二个集合只要姓张的姓名,且不要前两个
     *  * 将俩集合合并为一个
     *  * 通过集合中的名称创建Person对象,创建到一个新的集合中
     *  * 打印所有person信息
     */
    private void operate3(List<String> list1,List<String> list2){
        Stream<String> stream1 = list1.stream().filter(e -> e.length() == 3).limit(3);
        Stream<String> stream = list2.stream().filter(s -> s.startsWith("张")).skip(2);
        Stream<String> concat = Stream.concat(stream, stream1);
        List<Person> personList = new ArrayList<>();
        concat.forEach(e-> personList.add(new Person(e)));
        System.out.println(personList);

    }

    /**
     *   给定一个数组列表,返回一个由每个数字的平方构成的列表
     *  比如[1,2,3,4,5]返回[1,4,9,16,25]
     */
    private List<Integer> operate4(List<Integer> list){
        List<Integer> square = list.stream().map(e -> e * e).collect(Collectors.toList());
        return square;
    }
    /**
     * 使用map和reduce方法返回流中处理元素的总数
     */
    private int operate5(Stream<Integer> stream){
        Integer sum = stream.map(e -> 1).reduce(0, Integer::sum);
        return sum;
    }
    /**
     * * 现有Trader类和Transaction类
     *  * class Trader{//交易员
     *  * private String name;
     *  * private String city;
     *  * }
     *  * class Transaction{//交易
     *  * private Trader trader
     *  * private int year
     *  * private int value
     *  *
     *  * }
     *  * 需求;
     *  * 找出2018年发生的所有交易,并按照交易额升序排列
     *  * 交易员都在哪些城市工作过
     *  * 查找来自上海的交易员
     *  * 返回所有交易员的姓名,按照姓名字典排序
     *  * 返回来自上海交易员的姓名,照姓名的字典顺序排序
     *  * 有没有交易员在苏州工作
     *  * 打印所有在上海的交易员的所有交易总额
     *  * 所有交易中最高的交易额是多少
     *  * 找到交易额最小的交易
     */
    @Test
    public void test2(){
        List<Transaction> list = new ArrayList<>();
        list.add(new Transaction(new Trader("张三","杭州"),2018,80000));
        list.add(new Transaction(new Trader("李四","苏州"),2019,60000));
        list.add(new Transaction(new Trader("王五","南京"),2020,70000));
        list.add(new Transaction(new Trader("赵六","上海"),2018,100000));
        list.add(new Transaction(new Trader("田七","上海"),2021,60000));
        list.add(new Transaction(new Trader("汤姆","广州"),2017,50000));
        //2018年发生的所有交易按交易额升序排列
        List<Transaction> collect = list.stream().filter(e ->e.getYear()==2018)
                .sorted((e1, e2) -> Integer.compare(e1.getValue(), e2.getValue()))
                .collect(Collectors.toList());
        System.out.println(collect);
        //交易员都在哪些城市工作过
        list.stream().map(e->e.getTrader().getCity()).distinct().forEach(System.out::println);
        // 查找来自上海的交易员
        List<Trader> collect1 = list.stream()
                .filter(e -> "上海".equals(e.getTrader().getCity()))
                .map(Transaction::getTrader)
                .collect(Collectors.toList());
        System.out.println(collect1);
        //返回所有交易员的姓名,按照姓名字典排序
        List<String> collect2 = list.stream()
                .map(e -> e.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collect2);
        //返回来自上海交易员的姓名,照姓名的字典顺序排序
        List<String> collect3 = list.stream()
                .filter(e -> "上海".equals(e.getTrader().getCity()))
                .map(e -> e.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collect3);
        //有没有交易员在苏州工作
        boolean b = list.stream().map(e -> e.getTrader().getCity()).noneMatch("苏州"::equals);
        System.out.println(!b);
        //打印所有在上海的交易员的所有交易总额
        Optional<Integer> reduce = list.stream()
                .filter(e -> "上海".equals(e.getTrader().getCity()))
                .map(Transaction::getValue)
                .reduce(Integer::sum);
        if(reduce.isPresent()){
            System.out.println(reduce.get());
        }else {
            Integer integer = reduce.orElse(0);
            System.out.println(integer);
        }
        //找到交易额最小的交易
        Optional<Transaction> min1 = list.stream().min((o1, o2) -> o1.getValue() - o2.getValue());
        if(reduce.isPresent()){
            System.out.println(min1.get());
        }else {
            Transaction transaction = min1.orElse(new Transaction(null, 0, 0));
            System.out.println(transaction);
        }
        //所有交易中最高的交易额是多少
        IntSummaryStatistics collect4 = list.stream().collect(Collectors.summarizingInt(Transaction::getValue));
        int max = collect4.getMax();
        int min = collect4.getMin();
        long sum = collect4.getSum();
        System.out.println("交易总额:"+sum+"最高交易额:"+max+"最小交易额:"+min);

    }
}
class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Trader{
    private String name;
    private String city;

    public Trader() {
    }

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
class Transaction{
    private Trader trader;
    private int year;
    private int value;

    public Transaction() {
    }

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}