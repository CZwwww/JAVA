package com.xms.day03;

import java.util.HashMap;
import java.util.Map;

/**
 * 现有字符串"abdbcaabc",统计每个字符出现的次数,输出"a{3}b{3}c{2}d{1}"
 * @author czw
 * @create 2021-06-16-上午 11:17
 */
public class Test01 {
    public static void main(String[] args) {
        String str  = "abdbcaabc";
        str = showCount(str);
        System.out.println(str);
    }

    private static String showCount(String str) {
        Map<Character,Integer> map = new HashMap<>();
        char[] arr =str.toCharArray();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i<arr.length){
            if(map.get(arr[i])==null){
                map.put(arr[i],1);
            }else if(map.get(arr[i])!=null){
                map.put(arr[i],map.get(arr[i])+1);
            }
            i++;
        }
//        map.forEach((character, integer) -> System.out.print(character+"{"+integer+"}"));
        map.forEach((character, integer) -> sb.append(character+"{"+integer+"}"));
        return sb.toString();
    }
}
