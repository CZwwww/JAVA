package day05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo01 {
	public static void main(String[] args) {
		Map<Integer,String> map = 
				new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		/*
		 * 遍历所有的key
		 * Set keySet()
		 */
		Set<Integer> keySet = map.keySet();
		for(int key :keySet) {
			System.out.println(key);
		}
		/*
		 * 遍历所有的value
		 * Collection values()
		 */
		Collection<String> values = map.values();
		for(String value:values) {
			System.out.println(value);
		}
		/*
		 * 遍历所有键值对
		 * Set entrySet()
		 * 每一组键值对使用一个
		 */
		Set<Entry<Integer,String>> entrySet  = 
				map.entrySet();
		System.out.println(entrySet);
		/*
		 * getKey()与getValue()方法分别用
		 * 于获取一组键值对当中key与value
		 */
		for(Entry<Integer,String> entry:entrySet) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"->"+value);
		}
	}
}
