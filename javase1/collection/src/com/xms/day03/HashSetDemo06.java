package com.xms.day03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
 * 3、要求完成如下操作
 * 生成10个随机数，值在100到200之间；
 * 将这十个数存入HashSet集合中（有可能集合的长度小于10）。
 * 将这个HashSet集合转换成ArrayList集合
 * 重新为ArrayList集合排序，按照从小到大的顺序；
 * 使用foreach遍历集合；
 * @author czw
 * @create 2021-06-16-上午 9:34
 */
public class HashSetDemo06 {
    public static void main(String[] args) {
        Random rd = new Random();
        HashSet<Integer> hs = new HashSet<>();
        while(hs.size()<10){
            int rd2 = rd.nextInt(100)+100;
            hs.add(rd2);
        }
        List<Object> arrList =  Arrays.asList( hs.toArray());
        arrList.sort((o1, o2) -> (Integer)o1-(Integer)o2);
        arrList.iterator().forEachRemaining(System.out::println);
    }
}
