package jdk8;

import java.util.Comparator;

public class LambdaDemo05 {
	public static void main(String[] args) {
		/*
		 * �﷨��ʽ4:
		 * ���������ϵĲ���,�з���ֵ,����
		 * Lambda�����ж������,�����
		 * �������,Lambda�����д������
		 */
		Comparator<Integer> com1 = 
				new Comparator<Integer>() {

					@Override
					public int compare(Integer o1, Integer o2) {
						// TODO Auto-generated method stub
						System.out.println("����������");
						return o1-o2;
					}
				};
	}
}
