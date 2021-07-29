package day02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf =
				new RandomAccessFile("raf2.dat","rw");
		
		System.out.println(raf.getFilePointer());
		/*
		 * 1.��intֵת��Ϊ4���ֽ�
		 * ������ת��Ϊ��Ӧ���ֽ����еĹ��̳�Ϊ"���л�"
		 * 2.��4���ֽ�д���ļ�����
		 * ���ֽ�д����������ñ���Ĺ��̳�֮Ϊ�־û�
		 */
		raf.writeInt(123);
		System.out.println(raf.getFilePointer());
		raf.seek(0);
		//���ֽ�����ת��Ϊ��Ӧ���ݵĹ��̳�֮Ϊ�����л�
		int i = raf.readInt();
		System.out.println(i);
//		System.out.println(raf.getFilePointer());
		String str = "����һ���ַ���";
		//�ø÷���д�ַ���,˫����Ҳ�����ȥ
		raf.writeUTF(str);
		raf.seek(4);
		//˫���Ų��������
		System.out.println(raf.readUTF());
		raf.close();
		
	}
}
