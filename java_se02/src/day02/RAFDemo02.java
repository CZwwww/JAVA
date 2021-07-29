package day02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RAFDemo02 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = 
				new RandomAccessFile("raf.dat","r");
		/*
		 * 从文件中读取一个字节,并以int的形式返回,
		 * 该int值只有"低八位"有效,若是返回-1,则说
		 * 明已经移动到文件末尾
		 */
		System.out.println(raf.read());
		
		System.out.println((char)raf.read());
		System.out.println((char)raf.read());
		byte[] b = new byte[10];
		/*
		 * int read(byte[] b)
		 * 读取给定数组长度的字节量,
		 * 返回值是实际读取到的字节量
		 */
		System.out.println(raf.read(b));
		
		System.out.println(Arrays.toString(b));
		String str1 = new String(b,"UTF-8");
		System.out.println(str1);
		System.out.println(raf.readInt());
		System.out.println(raf.readInt());
		System.out.println(raf.readLong());
		System.out.println(raf.readChar());
		System.out.println(raf.readDouble());
		raf.close();
		int i = -127;
		System.out.println(i&0xFF);
	}
}
