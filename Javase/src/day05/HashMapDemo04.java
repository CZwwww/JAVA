package day05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo04 {
	//ʵ��Ӧ�ó���
	public static void main(String[] args) {
		Map<String,List<Person>> map = 
				new HashMap<>();
		List<Person> list1 = new ArrayList<Person>();
		list1.add(new Person("�ϰ�"));
		list1.add(new Person("����"));
		
		List<Person>  list2 = new ArrayList<>();
		list2.add(new Person("�����Ȱ�"));
		list2.add(new Person("��������"));
		list2.add(new Person("١���"));
		map.put("�ҵļ���", list1);
		map.put("Ů��", list2);
		System.out.println(map);
		System.out.println(map.size());
		
	}
}
