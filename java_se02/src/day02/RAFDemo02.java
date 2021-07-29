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
		 * ���ļ��ж�ȡһ���ֽ�,����int����ʽ����,
		 * ��intֵֻ��"�Ͱ�λ"��Ч,���Ƿ���-1,��˵
		 * ���Ѿ��ƶ����ļ�ĩβ
		 */
		System.out.println(raf.read());
		
		System.out.println((char)raf.read());
		System.out.println((char)raf.read());
		byte[] b = new byte[10];
		/*
		 * int read(byte[] b)
		 * ��ȡ�������鳤�ȵ��ֽ���,
		 * ����ֵ��ʵ�ʶ�ȡ�����ֽ���
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
