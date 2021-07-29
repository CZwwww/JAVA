package com.xms.basic.day06;
	/**
		 * 			1
		 * 		1		1
		 * 	1	    2	    1
*         1	    3	    3	  1
	 * 1	4		6		4	1	
 * 1	  5	    10	    10	   5	1
 * 
 * @author Administrator
 *
 */
public class Test02 {
	public static void main(String[] args) {
		printYTri(9);
	}
	static void printYTri(int num) {
		int[][] arr = new int[num][];
		if(num>3) {
			arr[0] = new int[]{1};
			arr[1] = new int[]{1,1};
			for(int i=2;i<num;i++) {
				arr[i] = new int[i+1];
				for(int j=0;j<arr[i].length;j++) {
					if(j==0||j==arr[i].length-1) {
						arr[i][j]= 1;
					}else
					arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
				}
			}
			Demo.printArr(arr);
		}else if(num>1){
			switch(num) {
			case 1:arr[0] = new int[]{1};break;
			case 2:{
				arr[0] = new int[]{1};
				arr[1] = new int[]{1,1};
			};break;
			}
		}else {
			System.out.println("error");
		}
	}
}
