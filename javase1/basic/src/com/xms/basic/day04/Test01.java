package com.xms.basic.day04;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = new int[20];
//		arr[0] = 1;
//		arr[1] = 1;
//		for(int i =2;i<20;i++){
//			arr[i] = arr[i-2] + arr[i-1];
//		}
//		System.out.println(Arrays.toString(arr));
		int[][] arr = new int[3][3];
		int sum = 0;
		for(int i=0;i<arr[0].length;i++){
			sum+=arr[i][i];
		}
	}
	static int sum(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	static int multi(int n) {
		int result = 1;
		for(int i=1;i<=n;i++) {
			result*=i;
		}
		return result;
	}
}
