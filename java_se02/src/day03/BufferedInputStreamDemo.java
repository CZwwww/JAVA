package day03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//�������ڶ�Դ�ļ���bis
		BufferedInputStream bis = 
				new BufferedInputStream(
						new FileInputStream("tomcat.rar"));
		//��������д������BOS
		BufferedOutputStream bos = 
				new BufferedOutputStream(
						new FileOutputStream("tomcatCopy4.rar"));
		//�߶���д
		int d = -1;
		while((d = bis.read())!=-1) {
			bos.write(d);
		}
		bis.close();
		bos.close();
	}
}
