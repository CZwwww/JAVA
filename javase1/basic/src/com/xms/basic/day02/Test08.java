package com.xms.basic.day02;
/**回行数
 */

public class Test08 {
	public static void main(String[] args) {
//		int a = 3659;
//		int count1 = 0;
//		int count2 = 0;
//		for(int i=0;i<4;i++) {
//			if(a%10%2==0)
//				count1++;
//			if(a%10%2!=0)
//				count2++;
//			a/=10;
//		}
//		System.out.println("偶数有:"+count1+"个,奇数有:"+count2+"个");
//		char[] arr = {'A','B','C','D','E',
//				'F','G','H','I','J',
//				'K','L','M','N','O',
//				'P','Q','R','S','T',
//				'U','V','W','X','Y','Z'};
//		for(char c:arr) {
//			System.out.println(c);
//		}
//		char[] arr1 = {'0','1','2','3','4','5','6','7','8','9'};
//		char[] arrD = Arrays.copyOf(arr, arr.length+arr1.length);
//		System.arraycopy(arr1, 0, arrD, arr.length, arr1.length);
////		System.out.println(Arrays.toString(arrD));
//		char a = 0;
//		for(int i=0;i<arr.length/2;i++) {
//			a = arr[i];
//			arr[i] = arr[arr.length-i-1];
//			arr[arr.length-i-1] = a;
//			System.out.println(a);
//		}
//		System.out.println(Arrays.toString(arr));
		int a = 20;
		int[][] sArr = new int[a][a];
		int num = 1;	
		for(int i=0;i<=a/2;i++) {
			for(int j=i;j<a-i;j++) {//行右箭头
				sArr[i][j] = num++;
			}
			for(int k=i+1;k<a-i;k++) {//列下箭头
				sArr[k][a-i-1] = num++;
			}
			for(int m=a-i-2;m>=i;m--) {//行左箭头
				sArr[a-i-1][m] = num++;
			}
			for(int n=a-i-2;n>=i+1;n--) {//列上箭头
				sArr[n][i] = num++;
			}	
		}
		for(int i=0;i<a;i++) {
			System.out.println(Test08.toString(sArr[i]));
		}
		
	
		
	}
	 public static String toString(int[] a) {
	        if (a == null)
	            return "null";
	        int iMax = a.length - 1;
	        if (iMax == -1)
	            return "[]";

	        StringBuilder b = new StringBuilder();
	        b.append('[');
	        for (int i = 0; ; i++) {
	            b.append(a[i]);
	            if (i == iMax)
	                return b.append(']').toString();
	            b.append(",\t");
	        }
	    }
}	
