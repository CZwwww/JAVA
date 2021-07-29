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
	 * ʹ�û����ַ���������������ı��ļ�
	 * ����ǰ�����Դ���뿽������Ŀ�ĸ�Ŀ¼��
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
			bw.write(s+'\r');//'\r'�ǻس�����������'\n'�ǻ��з�,unixϵͳʹ��\n macʹ��\r windowsʹ��\r\n
		}
		br.close();
		bw.close();
	}
}
