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
		 * дһ���ֽ�,д������intֵ��"�Ͱ�λ"
		 */
		fos.write('A');
		String str = "ѧ��˼";
		byte[]	data = str.getBytes("UTF-8");
		fos.write(data);
		fos.close();
		/*
		 * void write(byte[] b,int off)
		 */
	}
}
