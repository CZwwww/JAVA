package jdk8;

import java.util.Comparator;

public class MethodRefDemo02 {
	public static void main(String[] args) {
		//类::静态方法名
		Comparator<Integer> com1 = 
				(x,y)->Integer.compare(x, y);
		Comparator<Integer> com2 = 
				Integer::compare;
	}
}
