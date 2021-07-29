package day02;

import java.io.File;

public class FileDemo03 {
	public static void main(String[] args) {
		File dir = new File("a\\b\\c\\d\\e\\f");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		System.out.println("´´½¨Íê±Ï:"+dir.mkdirs());
	}
}
