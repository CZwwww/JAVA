package day01;

public class ExceptionDemo02 {
	/**
	 * finally��Զ�ᱻִ��
	 * NullPointerException
	 * StringIndexOutOfBoundsException
	 * ArrayIndexOutOfBoundsException
	 * ...
	 * ������RuntimeException(�Ǽ��ʱ�쳣)
	 * -->Exception
	 * catch�쳣��˳��,�쳣Ҫ��С����,�������ֱ������
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
			//finally���в�Ӧ����дreturn���
			System.out.println("����");
		}
		
	}
}
