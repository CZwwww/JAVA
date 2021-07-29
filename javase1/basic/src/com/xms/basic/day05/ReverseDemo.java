package com.xms.basic.day05;

import java.util.Arrays;

public class ReverseDemo {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void reverse(int[] arr ){
		int temp = 0;
		for(int i=0;i<=arr.length/2;i++) {
			temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;			
		}
	}
}
