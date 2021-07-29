package day03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo01 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = 
				new InputStreamReader(
						new FileInputStream("osw.txt"));
		/*
		 * int read()
		 * 读取一个字符,并以int值的形式返回
		 * 该int值的低16位有效
		 * 
		 * int read(char[] c)
		 * 一次性尝试读取给定字符数组长度的字符
		 * 并存入到字符数组当中,返回值为实际读取
		 * 的字符量
		 * 
		 * int read (char[] c,int off,int len)
		 * 将给定字符数组c中从off处开始连续读取
		 * len个字符
		 */
		int c = -1;
		while((c=isr.read())!=-1) {
			System.out.print((char)c);
		}
		isr.close();
	}
}
