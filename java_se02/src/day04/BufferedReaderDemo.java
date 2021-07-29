package day04;

import java.io.BufferedReader;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(
								new FileInputStream("bw.txt"),"UTF-8"));
		System.out.println(br.readLine());//一次读取一行字符串,连续读取若干字符,直到读取到换行符为止,返回的字符串不包括换行符
		System.out.println(br.readLine());//EOF则返回null
		br.close();
	}
}
