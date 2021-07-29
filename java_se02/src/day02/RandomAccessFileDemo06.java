package day02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo06 {
	/**
	 * 基于缓存的复制文件操作
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		long start = 0;
		long end =0;
		RandomAccessFile src = 
				new RandomAccessFile("tomcat.rar","r");
		RandomAccessFile des = 
				new RandomAccessFile("tomcatCopy2.rar","rw");
		byte[] buffer  = new byte[1024*20];
		int d = -1;
		start = System.currentTimeMillis();
		while((d = src.read(buffer))!=-1) {	
			des.write(buffer,0,d);	
		}
		end = System.currentTimeMillis();
		System.out.println(end-start);
		src.close();
		des.close();
	}
}
