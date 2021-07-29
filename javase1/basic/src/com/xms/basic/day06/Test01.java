package com.xms.basic.day06;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		int[][] arr = getArr(3,3);
		scan1(arr);
		int sum = sum(arr);
		Demo.printArr(arr);
		System.out.println(sum);
	
	}
	private static int[][] getArr(int len1,int len2) {
		// TODO Auto-generated method stub
		int[][] arr = new int[len1][len2];
		return arr;
	}
	static void scan1(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int index0 = 0;
		int index1 = 0;
		while(count!=arr[0].length*arr.length) {
			System.out.println("请输入第"+(count+1)+"个数字");
			arr[index0][index1++] = sc.nextInt();
			count++;
			if(index1==arr[0].length) {
				index0++;
				index1=0;
			}
		}
		sc.close();
	}
	static int sum(int[][] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			int max = getMax(arr[i]);
			sum+=max;
		}
		return sum;
	}
	static int getMax(int[] arr) {
		int max = arr[0];
		for(int j=1;j<arr.length;j++) {
			if(max<arr[j]) {
				max = arr[j];
			}
		}
		return max;
	}
}
