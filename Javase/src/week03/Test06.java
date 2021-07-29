package week03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test06 {
	public static void main(String[] args) {
		List<String> list = 
				new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		Iterator<String> it = list.iterator();
//		while(it.hasNext()) {
//			String str = it.next();
//			System.out.println(str);
//			it.remove();
//		}
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
