package com.xms.basic.day05;


import java.util.Arrays;

public class Demo02 {
	public static void main(String[] args) {
		int[] arr = {5,1,3,2,4};
		System.out.println(firstFind(arr, 6));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(binarySearch(arr,2));
	}
	static int firstFind(int[] arr,int num) {
		int index = 0;
		for(int i:arr) {
			if(i==num) {
				index=i;
				return index;
			}
		}
		return -1;
	}
	static int  binarySearch(int[] arr,int num) {
		int max = arr.length-1;
		int min = 0;
		int mid = (max+min)/2;
		while(arr[mid]!=num) {
			if(num<arr[mid]) {
				max = mid-1;
			}else {
				min = mid+1;
			}
			mid = (max+min)/2;
			if(min>max) {
				return -1;
			}
		}
		return mid;
	}
}
