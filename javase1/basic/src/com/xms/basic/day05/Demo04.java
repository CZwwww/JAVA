package com.xms.basic.day05;

import java.util.Arrays;

public class Demo04 {
	public static void main(String[] args) {
		int[] arr = {1,3,4,5,6,2};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int a = Arrays.binarySearch(arr, 3);
		System.out.println(a);
		int[] arr1 = {1,2,3,4,5,6};
		int[] ary = new int[3];
		System.out.println(Arrays.equals(arr, arr1)); 
		System.arraycopy(arr1, 1, ary, 0, 3);
		System.out.println(Arrays.toString(ary));
		String [] ary1 = new String[5];
		Arrays.fill(ary1, "JAVASE" );
		System.out.println(Arrays.toString(ary1));
		
	}
}
