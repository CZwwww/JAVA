package com.xms.day04;

public class ArgsDemo {

	public  int getSum(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
				
	}
}
class ArgsDemo01 extends ArgsDemo{
	public ArgsDemo01() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getSum(int...arr ) {
		// TODO Auto-generated method stub
		return super.getSum(arr);
	}
}