package day03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo01 {
	/**
	 * �����ļ��ֽ���������������ļ�
	 * ����ǰĿ¼�µ�tomcat.rar����ΪtomatCopy3,rar
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fis = 
				new FileInputStream("tomcat.rar");
		FileOutputStream fos = 
				new FileOutputStream("tomcatCopy3,rar",true);
		int d = -1;
		byte[] buffer = new byte[1024*10];
		while((d=fis.read(buffer))!=-1) {
			fos.write(buffer,0,d);
		}
		System.out.println("cp���");
	}
}
