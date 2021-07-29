package com.xms.basic.day04;

public class Test03 {
	public static void main(String[] args) {
		
	}
	
	static int[] change(int[] arr) {
		int temp = 0;
		int[] index = new int[2];

		for(int i=0;i<arr.length;i++) {
			boolean[] flags = new boolean[] {true,true};
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					continue;
				}else {
					if(arr[i]<arr[j]) {
						flags[0] = false;
					}
					if(arr[i]>arr[j]) {
						flags[1] = false;
					}
				}				
			}
			if(flags[0]) {
				index[0] = i;
			}
			if(flags[1]) {
				index[1] = i;
			}
		}
		temp = arr[index[0]];
		arr[index[0]] = arr[0];
		arr[0] = temp;
		temp = arr[index[1]];
		arr[index[1]] = arr[arr.length-1];
		arr[arr.length-1] = temp;
		 
		return arr;
	}
}
