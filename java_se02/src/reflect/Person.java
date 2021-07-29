package reflect;

//import javax.sound.midi.Soundbank;

public class Person {
	private  int age ;
	private String name;
	public Person(int age,String name) {
		this.age = age;
		this.name = name;
		System.out.println("Person Param run..."+this.age+":"+this.name);
		
	}
	public Person() {
		System.out.println("Person run...");
	}
	public void show() {
		System.out.println("show run..."+age+":"+name);
	}
	private void method() {
		System.out.println("method run...");
	}
	public void paramMethod(String str,int num) {
		System.out.println("paramMethod rum..."+str+":"+num);
	}
	public static void staticMethod() {
		System.out.println("staticMethod run...");
	}
}
