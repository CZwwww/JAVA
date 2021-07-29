package jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		//测试消费型接口
		
		happy(200000,
				m->System.out.println("你出去happy,消费了"+m+"大洋!"));
		//测试供给型接口
			List<Integer> numList = getNumList(10,
//				()->(int)(Math.random()*101));//Lambda表达式
/*					new Supplier<Integer>() {//匿名内部类

					@Override
					public Integer get() {
						// TODO Auto-generated method stub
						return (int)(Math.random()*101);
					}});*/
				new MyGet());//设计策略类
		System.out.println(numList);
		//测试函数型接口Function
		String newStr = strHandler("  我爱Java!   ",(s)->s.trim());
		//测试断言型接口Predicate
		List<String> list = 
				Arrays.asList("Jack","Li","Jerry","Q","Tom");
		List<String> strList = filterString(list, (s)->s.length()>3);
		System.out.println(strList);
	}
	//测试消费型接口
	public static void  happy(double money,Consumer<Double> con) {
		con.accept(money);
	}
	//需求:产生指定个数的整数并且放置到集合中返回,测试供给型接口
	public static List<Integer> getNumList(int num,Supplier<Integer> sup){
		List<Integer> list = 
				new ArrayList<>();
		for(int i = 0;i<num;i++) {
			Integer n = sup.get();
			list.add(n);			
		}
		return list;
	}
	//测试函数型接口
	public static String strHandler(String str,
			Function<String ,String> fun) {
		return fun.apply(str);
	}
	//测试断言型接口
	public static List<String> filterString(List<String> list,Predicate<String> pre ){
		List<String> strList = new ArrayList<>();
		for(String str : list) {
			if(pre.test(str)) {
				strList.add(str);
			}
		}
		return strList;
	}

}
//设计策略类
class MyGet implements Supplier<Integer>{

	@Override
	public Integer get() {
		// TODO Auto-generated method stub
		
		return (int)(Math.random()*101);
	}
	
}