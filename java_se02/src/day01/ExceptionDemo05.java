package day01;

public class ExceptionDemo05 {
	public static void main(String[] args)  {
		
		try {
			System.out.println(test(1,0,0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("HelloWorld");
	}
	public static int divide(int a,int b) throws Exception {
		if(b==0) {
			throw new Exception("0不能作除数");
		}
		return a/b;
	}
	public static int test(int a,int b,int c) throws Exception {
		return divide(a,b)+c;
	}
}
