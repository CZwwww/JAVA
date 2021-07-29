package day05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo04 {
	//实际应用场景
	public static void main(String[] args) {
		Map<String,List<Person>> map = 
				new HashMap<>();
		List<Person> list1 = new ArrayList<Person>();
		list1.add(new Person("老爸"));
		list1.add(new Person("老妈"));
		
		List<Person>  list2 = new ArrayList<>();
		list2.add(new Person("迪丽热巴"));
		list2.add(new Person("古力娜扎"));
		list2.add(new Person("佟丽娅"));
		map.put("我的家人", list1);
		map.put("女友", list2);
		System.out.println(map);
		System.out.println(map.size());
		
	}
}
