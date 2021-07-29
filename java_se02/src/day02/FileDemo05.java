package day02;

import java.io.File;
import java.io.IOException;

public class FileDemo05 {
	public static void main(String[] args) throws IOException {
//		File dir = new File("g\\h\\i\\j\\k");
//		File file = new File(dir,"mm.txt");
//		if(!dir.exists()) {	
//			System.out.println("dir:"+dir.mkdirs());
//		}
//		if(!file.exists()) {
//			System.out.println("file:"+file.createNewFile());
//		}
		File file = new File("g\\h\\i\\j\\k\\mm.txt");
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		if(!file.exists()) {
			file.createNewFile();
		}
	}
}
