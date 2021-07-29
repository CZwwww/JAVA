package day05;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TosynchronizedDemo {
	public static void main(String[] args) {
		List<String> arr = new ArrayList<String>();
		arr.add("one");
		arr.add("two");
		arr.add("three");
		System.out.println(arr);
		arr = Collections.synchronizedList(arr);
		Set<String> set = 
				new HashSet<>();
		set = Collections.synchronizedSet(set);
		Map<Integer,String> map = 
				new HashMap<>();
		map = Collections.synchronizedMap(map);
	}
}
