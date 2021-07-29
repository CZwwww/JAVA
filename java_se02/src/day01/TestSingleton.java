package day01;

public class TestSingleton {
	public static void main(String[] args) {
//		Singleton t1 = new Singleton();
//		t1.showMessage();
//		Singleton t2 =new Singleton();
//		t2.showMessage();
//		System.out.println(t1.equals(t2));
		Singleton t1 = Singleton.getInstance();
		t1.showMessage();
		Singleton t2 = Singleton.getInstance();
		System.out.println(t1.equals(t2));
		
	}
}
