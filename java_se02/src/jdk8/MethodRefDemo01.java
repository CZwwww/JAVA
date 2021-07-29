package jdk8;

//import java.io.PrintStream;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodRefDemo01 {
	public static void main(String [] args) {
		//对象::实例方法名
//		PrintStream ps = System.out;
		Consumer<String> con1 = 
				(x)->System.out.println(x);
		con1.accept("哈哈");
		Consumer<String> con2 =
				System.out::println;
		con2.accept("呵呵");
		/*
		 * 上述的方式还有一个前提
		 * println()方法要和accept()方法
		 * 参数列表和返回值类型一致
		 */
		//练习:
		Employee emp = new Employee();
		Supplier<String> sup1 = 
				emp::getName;
		System.out.println(	sup1.get());
	}
}
