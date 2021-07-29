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
		//���������ͽӿ�
		
		happy(200000,
				m->System.out.println("���ȥhappy,������"+m+"����!"));
		//���Թ����ͽӿ�
			List<Integer> numList = getNumList(10,
//				()->(int)(Math.random()*101));//Lambda���ʽ
/*					new Supplier<Integer>() {//�����ڲ���

					@Override
					public Integer get() {
						// TODO Auto-generated method stub
						return (int)(Math.random()*101);
					}});*/
				new MyGet());//��Ʋ�����
		System.out.println(numList);
		//���Ժ����ͽӿ�Function
		String newStr = strHandler("  �Ұ�Java!   ",(s)->s.trim());
		//���Զ����ͽӿ�Predicate
		List<String> list = 
				Arrays.asList("Jack","Li","Jerry","Q","Tom");
		List<String> strList = filterString(list, (s)->s.length()>3);
		System.out.println(strList);
	}
	//���������ͽӿ�
	public static void  happy(double money,Consumer<Double> con) {
		con.accept(money);
	}
	//����:����ָ���������������ҷ��õ������з���,���Թ����ͽӿ�
	public static List<Integer> getNumList(int num,Supplier<Integer> sup){
		List<Integer> list = 
				new ArrayList<>();
		for(int i = 0;i<num;i++) {
			Integer n = sup.get();
			list.add(n);			
		}
		return list;
	}
	//���Ժ����ͽӿ�
	public static String strHandler(String str,
			Function<String ,String> fun) {
		return fun.apply(str);
	}
	//���Զ����ͽӿ�
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
//��Ʋ�����
class MyGet implements Supplier<Integer>{

	@Override
	public Integer get() {
		// TODO Auto-generated method stub
		
		return (int)(Math.random()*101);
	}
	
}