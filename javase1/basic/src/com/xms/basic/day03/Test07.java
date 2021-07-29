package com.xms.basic.day03;
/**
 * 打印如下的图形：角形

   *
   * * *
   * * * * *
   * * * * * * *
   * * * * *
   * * *
   *



【拓展】
打印如下的图形：菱形1
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 





打印如下的图形：菱形2
**********        
****  ****        
***    ***        
**      **        
*        *        
**      **
***    ***
****  ****
**********


打印如下的图形：心形
              
      ******       ******          
    **********   **********         
  ************* *************		
 *****************************     
 *****************************     
 *****************************	   
  ***************************       
    ***********************         
      *******************          
        ***************             
          ***********             
            *******                
              ***                  
               *                  



编写程序，打印100-200之间的质数
 * @author Administrator
 *
 */
public class Test07 {
	public static void main(String[] args) {
		//打印三角形
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<2*i+1;j++) {
//				System.out.print("*");			
//			}		
//			System.out.println();
//		}
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<5-2*i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//打印菱形
//		for(int i=0;i<5;i++) {
//			for(int k=0;k<8/2-i;k++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<i+1;j++) {
//				System.out.print("* ");			
//			}		
//			System.out.println();
//		}
//		for(int i=0;i<4;i++) {
//			for(int k=0;k<i+1;k++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<5-i-1;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		//打印菱形2
//		for(int i=10;i>2;i-=2) {			
//			for(int j=0;j<i;j++) {
//				System.out.print("*");
//				if(j==i/2-1) {
//					for(int k=0;k<5-i/2;k++) {
//						System.out.print(" ");
//					}
//				}
//			}		
//			System.out.println();
//		}
//		for(int i=2;i<=10;i+=2) {			
//			for(int j=0;j<i;j++) {
//				System.out.print("*");
//				if(j==i/2-1) {
//					for(int k=0;k<5-i/2;k++) {
//						System.out.print(" ");
//					}
//				}
//			}		
//			System.out.println();
//		}
		
		/**
		 * 
	  ******       ******       12    19    6 12     24         11 -  17
    **********   **********      20   23	10 12    26			13	-  15
  ************* *************	26			  13     28			    14
 *****************************     
 *****************************     
 *****************************  29	   
  ***************************   27    
    ***********************         
      *******************          
        ***************             
          ***********             
            *******                
              ***                  
               *                  
		 */
	
		print();
		print2();
		print3();
	
		
//		for(int i=100;i<201;i++) {
//			boolean b = true;
//			for(int j=2;j<i;j++) {
//				if(i%j==0)
//					b=false;
//			}
//			if(b)
//				System.out.println(i);
//		}
//		int storage = 15;
//		int count = 0;
//		while(storage<50) {
//			storage+=5;
//			count++;
//		}
//		System.out.println(count);
//		}
		/**
		 * ① 前十二位的奇数位和6+0+2+4+6+8=26
② 前十二位的偶数位和9+1+3+5+7+9=34
③ 将奇数和与偶数和的3倍相加26+34*3=128
④ 取结果的个位数：128的个位数为8
⑤ 用10减去这个个位数10-8=2
		 */
	long sum1=0;
	long sum2=0;
	long num = 123456789011L;
	long temp = num;
	int num2 = 0;
	for(int i=0;i<12;i++) {
		
		if(i%2==0)
		sum1+=num%10;
		else
		sum2+=num%10;
		num/=10;
	}
	num2 = 10-(int)((sum1 + sum2*3)%10);
	
	System.out.println(temp*10+(long)num2);
	}
	
	static void print() {
		int min = 11;
		int max = 17;
		int count = 2;
		for(int i=19;i<28;i+=4) {//19 23 27	
			int m=0;	
			for(;m<14-i/2;m++) {
				System.out.print(" ");
			}	
			for(int j=0;j<i;j++) {
				if((m+j)>=min&&(m+j)<=max) {
					System.out.print(" ");
				}else
				System.out.print("*");	
			}
			min +=count;
//			System.out.println(min);
			max -=count--;
		System.out.println();	
		}
		
	}
	static void print3() {
		for(int i=0;i<28;i+=4) {
			
			for(int m=0;m<i/2+1;m++) {
				System.out.print(" ");
			}
				
			for(int j=0;j<27-i;j++) {
				System.out.print("*");
			}
		System.out.println();	
		}
		
		for(int i=0;i<15;i++) {
			if(i==14)
				System.out.print("*");
			System.out.print(" ");
		}
	}
	static void print2() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<29;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
