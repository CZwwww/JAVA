package jdk8;

//import java.io.PrintStream;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodRefDemo01 {
	public static void main(String [] args) {
		//����::ʵ��������
//		PrintStream ps = System.out;
		Consumer<String> con1 = 
				(x)->System.out.println(x);
		con1.accept("����");
		Consumer<String> con2 =
				System.out::println;
		con2.accept("�Ǻ�");
		/*
		 * �����ķ�ʽ����һ��ǰ��
		 * println()����Ҫ��accept()����
		 * �����б�ͷ���ֵ����һ��
		 */
		//��ϰ:
		Employee emp = new Employee();
		Supplier<String> sup1 = 
				emp::getName;
		System.out.println(	sup1.get());
	}
}
