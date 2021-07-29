package day01;

public class ExceptionDemo03 {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p);
		
		try {
			p.setAge(3);
		}catch(RuntimeException e ){
			//输出造成异常的原因
//			System.out.println(e.getMessage());
			//输出异常的堆栈信息
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
//			System.out.println("年龄设置有误");
			/*
			 * 利用throw关键字主动抛出一个异常实例
			 */
			throw new RuntimeException("不是人类的年龄");
		}
			this.age = age;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "age:"+age;
	}
}