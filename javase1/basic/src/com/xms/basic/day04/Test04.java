package com.xms.basic.day04;

import java.util.Arrays;
import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		int[] arr = getArr(5,100);
		System.out.println(Arrays.toString(arr));
		System.out.print("{");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i!=arr.length-1)
			System.out.print(",");
		}
		System.out.println("}");
		arr = Arrays.copyOf(arr, arr.length+1);
		arr[arr.length-1] = 9;
	}
	//获取随机元素填充的数组
	static int[] getArr(int size,int rand) {
		Random rd = new Random();
		int[] arr = new int[size];
		int num = 0;
		int index = 0;
		loop:while(arr[size-1]==0) {
			num = rd.nextInt(rand);
			for(int i=0;i<size;i++) {
				if(arr[i]==num)
					continue loop;
			} 
			arr[index]=num;
			index++;
		}	
		return arr;
	}
	//删除选定位置的元素
	static int[] delArr(int[] ary,int index) {
		int[] arr = new int[ary.length-1];
		for(int i=0;i<arr.length;i++) {
			if(i>=index) {
				arr[i] = ary[i+1];
			}
			arr[i] =ary [i];
		}
		return arr;
	}
}
