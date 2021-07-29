package day02;

import java.io.File;
import java.io.IOException;

public class FileDemo07 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Administrator\\eclipse-workspace\\java_se02\\g\\h\\i\\j\\k\\mm.txt");
		File file1 = file.getParentFile();
		file1.mkdirs();
		file.createNewFile();
		delete2(file);
	}
	
	
	public static void delete2(File f) {
		if(f==null||!f.exists()) {
			throw new RuntimeException("文件或目录不存在");
		}
		if(f.isFile()) {
			f.delete();
			return;
		}
		File[] files = f.listFiles();
		for(File file :files) {
			delete2(file);//递归调用,删除子文件和子文件夹
		}
		f.delete();
	}
}
