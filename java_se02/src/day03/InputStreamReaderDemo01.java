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
		 * ��ȡһ���ַ�,����intֵ����ʽ����
		 * ��intֵ�ĵ�16λ��Ч
		 * 
		 * int read(char[] c)
		 * һ���Գ��Զ�ȡ�����ַ����鳤�ȵ��ַ�
		 * �����뵽�ַ����鵱��,����ֵΪʵ�ʶ�ȡ
		 * ���ַ���
		 * 
		 * int read (char[] c,int off,int len)
		 * �������ַ�����c�д�off����ʼ������ȡ
		 * len���ַ�
		 */
		int c = -1;
		while((c=isr.read())!=-1) {
			System.out.print((char)c);
		}
		isr.close();
	}
}
