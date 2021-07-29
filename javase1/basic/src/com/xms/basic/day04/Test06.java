package com.xms.basic.day04;

import java.util.Arrays;
import java.util.Scanner;

import com.xms.basic.day02.Test08;

public class Test06 {
	public static void main(String[] args) {
//		int[][] arr = create(4,4);
//		scan1(arr);
//		printSArr(arr);
//		changeRows(arr);
//		printSArr(arr);
				
		int[][] ary = create(8,8);
		recycle(ary);
//		scan1(ary);
		setZeroAround(ary);
		setZeroAng(ary);
		printSArr(ary);
		createArrByMax(ary);
		
		
	}
	static int[][] create(int rows,int columns) {
		int[][] sArr = new int[rows][columns];
		return sArr;
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
	static void changeRows(int[][] arr) {
		int[] temp = new int[arr[0].length];
		for(int j=0;j<arr.length/2;j++) {
			for(int i=0;i<temp.length;i++) {
				temp[i] = arr[j][i];
				arr[j][i] = arr[arr.length-1-j][i];
				arr[arr.length-1-j][i] = temp[i];
			}
		}
	}
	static void setZeroAround(int[][] arr){
		for(int i=0;i<arr[0].length-1;i++) {
			arr[0][i] = 0;
			arr[arr.length-1][arr[0].length-1-i] = 0;
		}
		for(int i=0;i<arr.length-1;i++) {
			arr[i][arr.length-1] = 0;
			arr[arr.length-1-i][0] = 0;
		}
	}
	public static void printSArr(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(Test08.toString(arr[i]));
		}
	}
	static void recycle(int[][] arr){
		int numR = 1;
		int numC = arr.length;
		for(int i=0;i<arr.length/2;i++) {
			for(int j=i;j<arr[i].length-i-1;j++) {
				arr[i][j] = numR;
				arr[arr.length-1-i][arr[i].length-1-j] = (numR++)+2*(arr[i].length-1-2*i);
			}
			for(int j=i;j<arr.length-i-1;j++) {		
				arr[j][arr[i].length-i-1] = numC;
				arr[arr.length-j-1][i] = (numC++)+2*(arr.length-1-2*i);				
			}
			numR = arr[i+1][i]+1;
			numC = arr[i+1][i]+arr.length-2*(i+1);
		}
	}
	static void setZeroLeftDown(int[][] arr) {
		arr[arr.length-1][0] = 0; 
	}
	static void setZeroAng(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i][i] = 0;
			arr[arr.length-1-i][i] = 0;
		}
	}
	static int getMax(int[] arr) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	static void createArrByMax(int[][] sArr) {
		int[] arr = new int[sArr.length];
		for(int i=0;i<arr.length;i++) {
			arr[i] = getMax(sArr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}
}
