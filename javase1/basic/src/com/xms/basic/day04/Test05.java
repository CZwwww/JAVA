package com.xms.basic.day04;

import java.util.Arrays;

public class Test05 {
	public static void main(String[] args) {
		int[] arr = {3,5,7,8,1,2,9};
		arr = sort(arr,2);
		System.out.println(Arrays.toString(arr));
	}
	static int[] sort(int[] arr,int m) {
		int[] arr1 = new int[arr.length] ;
		for(int i=0;i<m;i++) {//置换前后m位数
			arr1[i] = arr[arr.length-m+i];
			arr1[arr.length-m+i] = arr[i];
		}
		for(int i=m;i<arr.length-m;i++) {//填充m-x-m,m间的x
			arr1[i] = arr[i];
		}
		return arr1;
	}
}
