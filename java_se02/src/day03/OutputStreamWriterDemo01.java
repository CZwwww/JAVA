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
		 * дһ���ַ�(char),д������intֵ�ĵ�16λ
		 * void write(char[] c)
		 * һ���Խ������ַ����������е��ַ�д��
		 * 
		 * void write(char[] c,int off,int len)
		 * ���������ַ������д�off����ʼ������len���ַ�д��
		 * 
		 * void write(String str)
		 * ���������ַ���ת��Ϊ�ַ���д��
		 * 	void write(String str,,int off,int len)
		 * ���������ַ������д�off����ʼ����
		 * ��len���ַ�д��
		 */
		/*
		 * Ĭ�������,write()�����Ὣ��ǰ�ַ�������ϵͳĬ�ϵ�
		 * �ַ���ת��Ϊ�ֽں�д��
		 * ϵͳĬ�ϵ��ַ���:GBK
		 */
		osw.write("��Һ�");
		osw.close();
	}
}
