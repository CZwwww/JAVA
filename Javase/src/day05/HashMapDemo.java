package day05;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		String line =	
				"123,345,234,123,678,345,123,123";
		String[] line1 = line.split(",");
		Map<String,Integer> map = new HashMap<>();
		for(String num : line1) {
			if(map.containsKey(num)) {
				map.put(num, 1);
			}else {
				map.put(num, map.get(num)+1);
			}
		}
		System.out.println(map);
	}
}
