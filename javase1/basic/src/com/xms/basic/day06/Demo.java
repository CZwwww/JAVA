package com.xms.basic.day06;

import java.util.Arrays;

public class Demo<T> {
	public static void main(String[] args) {
//		int[][] arr = new int [3][2];//三个有两个元素的一维数组
//		
//		int count = 1;
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j] = count++;
//			}
//		}
//		
//		//一维数组元素个数不确定
//		int[][] arr1 = new int [3][];
//		
		//静态初始化
		char[][] chs1 = new char[][] {{'a','b','c'},{'1','2','3'}};
		int[][] chs2 = {{'a','b','c'},{'1','2'}};
		//遍历二维数组
		Demo<String> d = new Demo<>();
		
	}
		static  void printArr (int[][] chs2) {
			for(int i=0;i<chs2.length;i++) {
				
				System.out.println(Arrays.toString(chs2[i]));
			
		}
	}
}
