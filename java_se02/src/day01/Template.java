package day01;
//ģ��ģʽ
public abstract class Template {
	//���ҽ��ܵķ���
	public void sayHello() {
		System.out.println("��Һ�!");
		sayName();
		sayInfo();
		System.out.println("лл!�ټ�!");
	}

	public abstract void sayInfo();

	public abstract void sayName();
}
