package day02;

import java.io.File;
import java.io.IOException;

public class FileDemo04 {
	public static void main(String[] args) throws IOException {
//		File file = ;
//				new File("."+File.separator+"demo"+File.separator+"demo.txt");
		File dir = new File("demo");	
		File file = new File(dir,"demo.txt");//这里的dir只提供了路径,不能同步创建目录
		dir.mkdir();
		if(!file.exists()) {
			
			file.createNewFile();
		}
		System.out.println(file.createNewFile());
	}
}
