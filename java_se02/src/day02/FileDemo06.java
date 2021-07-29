package day02;

import java.io.File;
import java.util.Arrays;

public class FileDemo06 {
	/**
	 * 查看当前目录下所有的子项
	 */
	public static void main(String[] args) {
		File file  =  new File(".");
		System.out.println(Arrays.toString(file.list()));
		System.out.println(Arrays.toString(file.listFiles()));
		File[] subs = file.listFiles();
		for(File f :subs) {
			System.out.println(f.getName()+":"+(f.isFile()?"file":"dir"));
		}
		
	}
}
