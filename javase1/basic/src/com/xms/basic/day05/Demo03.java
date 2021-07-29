package com.xms.basic.day05;

import java.util.Arrays;

public class Demo03 {
	public static void main(String[] args) {
		int[] arr = {5,1,2,3,4,7};
//		searchSort(arr);
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void bubbleSort(int[] arr) {
		int temp = 0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;	
				}
			}
		}
	}
	static void searchSort(int[] arr) {
		int temp = 0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=1+i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;	
				}
			}
		}
	}
//	static void quickSort(int[] arr) {
//		int pivot = arr[arr.length/2];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<pivot)
//				
//		}
//		
//		
//	}
	public static void sort(/*形参？*/int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]   = arr[j+1];
					arr[j+1] = temp;
			}
		}		
	}
}
}
