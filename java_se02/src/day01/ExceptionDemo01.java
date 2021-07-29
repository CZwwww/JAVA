package day01;

public class ExceptionDemo01 {
	/**
	 * java�쳣�������:
	 * ������ֻ�ܽ��Exception,���ܽ��Error
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		/*
		 * JVM��������Ҫ����һ��lang�ķ���
		 * JVM����һ����ָ���쳣��ʵ��������
		 * ���﷢��������(�������),�ڵ�ǰ��
		 * �׳��쳣,�ܳ���JVM�������ǵĴ���Ƭ��,
		 * �鿴�Ƿ����쳣�������,�����ֵ�ǰ����û��
		 * �쳣�������,�򽫸��쳣ʵ���׳�����ǰ����
		 * ���ڵķ���֮��,�����׳���main����֮��ʱ
		 * JVM��ֱ��ɱ����ǰ����,�����˳�,�쳣��������
		 * �Ĵ���Ͳ���ִ��
		 */
		

		try {
			String str = "abc";
//			System.out.println(str.charAt(0));
			int i = Integer.parseInt(str);
		}catch(NullPointerException e) {
			System.out.println("�����˿�ָ���쳣");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("�������ַ����±�Խ���쳣");
		}catch(Exception e) {
			/*
			 * �����쳣���Ƶ�����ϰ��:
			 * �����һ��catch�в���Exception
			 * �Ա�֤���Բ����ڳ����г��������쳣���,
			 * ʹ�ó��򲻻�������˵����
			 */
			System.out.println("���������˸��쳣");
		}
		System.out.println("���������");
	}
}
