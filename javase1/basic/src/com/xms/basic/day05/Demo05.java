package com.xms.basic.day05;

import java.util.Arrays;
import java.util.Random;

/**
 * 双色球选号
 * 规则：
 * 6个红球+1个蓝球组成
 * 红球01~33		蓝球01~16
 * 红球不能有重复，且红球需要从小到大进行排序
 * 
 * 03 18 11 16 23 31 13
 */
public class Demo05 {
	public static void main(String[] args) {
		String[] redPool = new String[33];
		boolean[] flags = new boolean[33];
		String[] pool = new String[6];
		fillPool(redPool);
		Random rd = new Random();
		String bluePool = redPool[rd.nextInt(16)];

		int count = 0;
		int index = 0;
		while(true) {
			index = rd.nextInt(33);
			if(flags[index]==true) {
				continue;
			}else{
				pool[count] = redPool[index];
				flags[index] = true;
				count++;
			}
			if(count>5) {
				break;
			}
		}
		Arrays.sort(pool);
//		System.out.println(Arrays.toString(pool));
		pool = Arrays.copyOf(pool, pool.length+1);
		pool[pool.length-1] = bluePool;
		System.out.println(Arrays.toString(pool));

	}
	static void fillPool(String[] arr) {
		int count = 0;
		char[] c = new char[2];
		for(char i='0';i<='3';i++) {
			c[0] = i;
			for(char j='0';j<='9';j++) {
				if(i=='0'&&j=='0') {
				continue;
				}
				c[1] = j;
				arr[count++] =  String.valueOf(c);
				if(i=='3'&&j=='3') {
					break;
				}
			}
			
			
			}
	}
}
