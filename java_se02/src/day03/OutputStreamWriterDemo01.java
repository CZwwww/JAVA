package day03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo01 {
	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = 
				new OutputStreamWriter(
						new FileOutputStream("osw.txt"));
		/*
		 * void write(int d)
		 * 写一个字符(char),写出给定int值的低16位
		 * void write(char[] c)
		 * 一次性将给定字符数组中所有的字符写出
		 * 
		 * void write(char[] c,int off,int len)
		 * 将给定的字符数组中从off处开始连续将len个字符写出
		 * 
		 * void write(String str)
		 * 将给定的字符串转换为字符后写出
		 * 	void write(String str,,int off,int len)
		 * 将给定的字符数组中从off处开始连续
		 * 将len个字符写出
		 */
		/*
		 * 默认情况下,write()方法会将当前字符串按照系统默认的
		 * 字符串转换为字节后写出
		 * 系统默认的字符集:GBK
		 */
		osw.write("大家好");
		osw.close();
	}
}
