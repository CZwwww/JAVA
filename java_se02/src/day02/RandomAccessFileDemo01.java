package day02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RandomAccessFileDemo01 {
	/**
	 * ������̨���������д�뵽note.txt�ļ�����
	 * Ҫ������ظ�����,����ԭ�ȵ����ݲ��ᱻ����
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = 
				new RandomAccessFile("note.txt", "rw");
		Scanner sc = new Scanner(System.in);
		while(true) {
			String str = sc.next();
			if("exit".equals(str)) {
				break;
			}
			raf.seek(raf.length());
			raf.writeUTF(str);
		}
		System.out.println("��лʹ��");
		raf.close();
	}
}
