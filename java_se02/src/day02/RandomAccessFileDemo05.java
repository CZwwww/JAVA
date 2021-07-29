package day02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo05 {
	/**
	 * �����ļ�
	 * ����ǰĿ¼�µ�tomcat.rar����Ϊ
	 * tomcatCopy1.rar
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		long start = 0;
		long end =0;
		RandomAccessFile src = 
				new RandomAccessFile("tomcat.rar","rw");
		RandomAccessFile des = 
				new RandomAccessFile("tomcatCopy.rar","rw");
		int  d = -1;
		start = System.currentTimeMillis();
		while((d=src.read())!=-1) {
			des.write(d);
		}
		end = System.currentTimeMillis();
		System.out.println("cp���");
		src.close();
		des.close();
		System.out.println(end-start);
	}
}
