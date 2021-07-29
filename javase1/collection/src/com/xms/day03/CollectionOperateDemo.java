package com.xms.day03;

import java.util.*;

/**
 * 4、要求完成如下操作
 * 1 ） 要求集合对象c1中，只能添加字符串形式的单个元素，元素可以重复，在测试类中为c1集合添加字符串“这是一个可以重复的集合”遍，然后遍历打印结果。
 * 2 ）要求集合对象c2中只能添加整型数值，并且不可重复，按自然顺序排序。要求遍历集合对象，打印添加进1,2,3,4,5五个数字的c2集合
 * 3 ）要求创建一个合适的Map集合对象m1，它的键和值都只能是字符串，并且值可以是null，像map集合中添加三组字符串，其中一个只有键，值是空，遍历这个集合对象的键，并打印键。
 * 4）想办法将m1中所有值为null都替换成一个字符串”这里是空值”
 * 5）遍历m1的所有值。
 * @author czw
 * @create 2021-06-16-上午 9:44
 */
public class CollectionOperateDemo {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();
        for(int i = 0;i<10;i++){
            c1.add("这是一个可以重复的集合");
        }
        c1.iterator().forEachRemaining(System.out::println);

        Collection<Integer> c2 = new LinkedHashSet<>();
        c2.add(1);
        c2.add(2);
        c2.add(3);//这里故意重复添加,测试该集合是否元素唯一
        c2.add(3);
        c2.add(4);
        c2.add(5);
        c2.forEach(System.out::println);

        Map<String,String> m1 = new HashMap<>();
        m1.put("1","小黑");
        m1.put("2",null);
        m1.put("3","小白");
        m1.forEach((s, s2) -> System.out.println("key:"+s+",value:"+s2));
    }
}
