package day02;

import java.io.File;

public class FileDemo02 {
	/**
	 * 在当前目录下创建一个demo目录
	 */
	public static void main(String[] args) {
		//创建File对象用于描述需要创建的目录
		//.和分隔符可以省略,默认就是当前目录
//		File dir = new File("."+File.separator+"demo");
		File dir = new File("demo");
		if(!dir.exists()) {
			dir.mkdir();
		}
		
	}
}
