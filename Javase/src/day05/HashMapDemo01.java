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
		 * �������е�key
		 * Set keySet()
		 */
		Set<Integer> keySet = map.keySet();
		for(int key :keySet) {
			System.out.println(key);
		}
		/*
		 * �������е�value
		 * Collection values()
		 */
		Collection<String> values = map.values();
		for(String value:values) {
			System.out.println(value);
		}
		/*
		 * �������м�ֵ��
		 * Set entrySet()
		 * ÿһ���ֵ��ʹ��һ��
		 */
		Set<Entry<Integer,String>> entrySet  = 
				map.entrySet();
		System.out.println(entrySet);
		/*
		 * getKey()��getValue()�����ֱ���
		 * �ڻ�ȡһ���ֵ�Ե���key��value
		 */
		for(Entry<Integer,String> entry:entrySet) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"->"+value);
		}
	}
}
