package day01;
//����ģʽ(����ʽ)(?����ʽ?)
public class Singleton {
	//��������˽�л�
	private Singleton() {
		
	}
	//����һ��˽�еľ�̬�ĵ�ǰ���ʵ��
	private static Singleton instance = 
			new Singleton();
	//����һ�����еľ�̬���ܷ��ص�ǰ��ʵ���ķ���
	public static Singleton getInstance() {
		return instance;
	}
//	public Singleton createSingleton() {
//		return null;
//		
//	}
	public void showMessage() {
		System.out.println("HelloWorld");
	}
}
