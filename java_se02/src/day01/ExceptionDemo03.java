package day01;

public class ExceptionDemo03 {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p);
		
		try {
			p.setAge(3);
		}catch(RuntimeException e ){
			//�������쳣��ԭ��
//			System.out.println(e.getMessage());
			//����쳣�Ķ�ջ��Ϣ
			e.printStackTrace();
		}
		System.out.println(p);
	}
}
class Person{
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>200||age<0) {
//			System.out.println("������������");
			/*
			 * ����throw�ؼ��������׳�һ���쳣ʵ��
			 */
			throw new RuntimeException("�������������");
		}
			this.age = age;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "age:"+age;
	}
}