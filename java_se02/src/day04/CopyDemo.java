package day04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.io.UnsupportedEncodingException;

public class CopyDemo {
	/**
	 * 使用缓存字符输入输出流复制文本文件
	 * 将当前程序的源代码拷贝到项目的根目录下
	 * @throws IOException 
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws  IOException {
		BufferedWriter bw = 
				new BufferedWriter(
						new OutputStreamWriter(
								new FileOutputStream("CopyDemo.java"),"UTF-8"));
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(
								new FileInputStream(".\\src\\day04\\CopyDemo.java")));
		String s = null;
		while((s=br.readLine())!=null) {
			bw.write(s+'\r');//'\r'是回车符返回行首'\n'是换行符,unix系统使用\n mac使用\r windows使用\r\n
		}
		br.close();
		bw.close();
	}
}
