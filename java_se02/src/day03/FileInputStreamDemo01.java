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
		 * ���ڸ������ļ����������ļ���������
		 */
		FileInputStream fis = 
				new FileInputStream("fos.dat");
		/*
		 * int read()
		 * ��ȡһ���ֽ�,����intֵ����ʽ����
		 * �Ͱ�λ��Ч,������-1,˵��EOF
		 * 
		 */
		System.out.println((char)fis.read());
		/*
		 * int read(byte[] b )	
		 * һ���Գ��Զ�ȡ�����ֽ����鳤�ȵ��ֽ�
		 * ������������ֽ�������,����ֵΪʵ�ʶ�ȡ
		 * �����ֽ���
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
		 * �Ӹ���������ȡlen���ֽڲ��Ӹ���
		 * �ֽ������start����ʼ���
		 */
	}
}