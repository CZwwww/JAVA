package day03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo01 {
	public static void main(String[] args) throws IOException {
		/*
		 * FileOutputStream(File file)
		 * FileOutputStream(String fileName)
		 * 
		 */
		FileOutputStream fos = 
				new FileOutputStream("fos.dat");
		/*
		 * void write(int d)
		 * 写一个字节,写出给定int值的"低八位"
		 */
		fos.write('A');
		String str = "学码思";
		byte[]	data = str.getBytes("UTF-8");
		fos.write(data);
		fos.close();
		/*
		 * void write(byte[] b,int off)
		 */
	}
}
