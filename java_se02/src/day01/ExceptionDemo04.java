package day01;

public class ExceptionDemo04 {
	//�����׳��쳣�ĵڶ������
	
	public static void main(String[] args) {
		connectDB("admin","1234");
	}
	//ģ���û���¼���ݿ�
	public static void connectDB(String user,String pwd) {
		if("scoot".equals(user)&&"123456".equals(pwd)) {
			System.out.println("���ݿ����ӳɹ�");
		}else {
			throw new RuntimeException("�û��������벻��ȷ");
		}
	}
}
