package com.xms.basic.day04;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		int[] arr = {3,5,7,8,1,2,9};
		
		arr = Test03.change(arr);
		System.out.println(Arrays.toString(arr));
		Base sub = new Sub();
		sub.fun(15, 58);
		Sub sub1 = new Sub();
		sub1.fun(15,new int[] {58,59});
//		int num = sc.nextInt();
//		int[] arr1 = Arrays.copyOf(arr, arr.length+1);
//		if(num>arr[arr.length-1]) {
//			arr1[arr1.length-1] = num;
//		}else {
//			for(int i=0;i<arr.length;i++) {
//				if(num<arr[i]) {
//					arr1[i]=num;
//					System.arraycopy(arr, i, arr1, i+1, arr1.length-i-1);
//					break;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr1));
	}
}
class Base {
	void fun(int a,int...is) {
		System.out.println("base");
		
	}
}
class Sub extends Base{
	@Override
	void fun(int a, int[] is) {
		// TODO Auto-generated method stub
		System.out.println("sub");
	}
}