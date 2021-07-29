package day01;
//模板模式
public abstract class Template {
	//自我介绍的方法
	public void sayHello() {
		System.out.println("大家好!");
		sayName();
		sayInfo();
		System.out.println("谢谢!再见!");
	}

	public abstract void sayInfo();

	public abstract void sayName();
}
