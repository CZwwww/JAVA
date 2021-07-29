package com.xms.basic.day02;

public class OperatorDemo01 {
	public static void main(String[] args) {
//		String s = "1";
//		switch(s) {
//		case "0":System.out.println(0);
//		break;
//		case "1":System.out.println(1);
//		break;
//		case "2":System.out.println(2);
//		}
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		Scanner sc1 = new Scanner(System.in);
//		int i = sc1.nextInt();
//		for(int i=0;i<10;i++) {
//			
//			for(int j=0;j<10;j++) {
//				System.out.println("内层");
//				if(j==7)
//					break;
//			}
//			
//			System.out.println("外层");
//			if(i==5)
//				break;
//		}
	
		
			int i = 0, j = 5; 
			tp: for (;;){ 
			i++; //1
			for(;;){
			if(i > j--)//4 3 2 1 0 -1
			break tp; 
			}
			} 
			System.out.println("i = " + i + ", j = "+ j);  
			} 

}
