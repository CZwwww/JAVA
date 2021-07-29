package week03;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;



public class Test07 {
	public static void main(String[] args) {
		Random rd = new Random();
		Map<Integer,Integer> s = new HashMap<>();
		Set<Integer> m = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		int num;
		while(s.size()<100) {
			num = rd.nextInt(100)+1;
			if(s.get(num) != null) {
				continue;
			}
			s.put(num, 1);
			list.add(num);
		}
		list.remove(10);
		for(int i :list) {
			System.out.println(i);
		}
		Set<Entry<Integer,Integer>> entrySet = s.entrySet();
		//Entry:用来表示键值对的类
		for(Entry<Integer,Integer> entry:entrySet) {
			System.out.println(entry);
		}
//		for(int i :s) {
//			System.out.println(i);
//		}
	}
}
