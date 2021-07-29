package day03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamDemo01 {
	public static void main(String[] args) throws IOException {
		/*
		 * FileInputStream(File file)
		 * FileInputStream(String fileName)
		 * 基于给定的文件名创建读文件的输入流
		 */
		FileInputStream fis = 
				new FileInputStream("fos.dat");
		/*
		 * int read()
		 * 读取一个字节,并以int值的形式返回
		 * 低八位有效,若返回-1,说明EOF
		 * 
		 */
		System.out.println((char)fis.read());
		/*
		 * int read(byte[] b )	
		 * 一次性尝试读取给定字节数组长度的字节
		 * 并存入给定的字节数组中,返回值为实际读取
		 * 到的字节量
		 */
		byte[] buffer = new byte[30];
		int len = -1;
		System.out.println(len= fis.read(buffer));
		System.out.println(Arrays.toString(buffer));
		String str = new String(buffer,0,len,"UTF-8");
		System.out.println(str);
		fis.close();
		/*
		 * int read(byte[] b,int off,int len)
		 * 从该流中最多读取len个字节并从给定
		 * 字节数组的start处开始存放
		 */
	}
}