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
		System.out.println(br.readLine());//һ�ζ�ȡһ���ַ���,������ȡ�����ַ�,ֱ����ȡ�����з�Ϊֹ,���ص��ַ������������з�
		System.out.println(br.readLine());//EOF�򷵻�null
		br.close();
	}
}
