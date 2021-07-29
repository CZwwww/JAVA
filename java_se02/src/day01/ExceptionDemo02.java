package day01;

public class ExceptionDemo02 {
	/**
	 * finally永远会被执行
	 * NullPointerException
	 * StringIndexOutOfBoundsException
	 * ArrayIndexOutOfBoundsException
	 * ...
	 * 都属于RuntimeException(非检查时异常)
	 * -->Exception
	 * catch异常有顺序,异常要从小到大,否则会出现编译错误
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(test(null)+","+test("0")+","+test(""));
	}
	public static int test(String str) {
		
		try {
			return str.charAt(0)-'0';
		}catch(NullPointerException e){
			return 1;
		}catch(RuntimeException e) {
			return 2;
		}catch(Exception e) {
			return 3;
		}finally {
			//finally当中不应该书写return语句
			System.out.println("结束");
		}
		
	}
}
