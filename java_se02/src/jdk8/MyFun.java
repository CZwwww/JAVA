package jdk8;

public interface MyFun {
	default String getName() {
		return "����";
	}
	public static void show() {
		System.out.println("�ӿ��еľ�̬����");
	}
}
