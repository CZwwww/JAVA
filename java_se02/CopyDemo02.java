package day03;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CopyDemo02 {
	/**
	 * ʹ���ַ���������������ı��ļ�
	 * ����ǰ�����Դ���뿽������Ŀ��Ŀ¼��
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader isr =
				new InputStreamReader(
						new FileInputStream(
								".\\src\\day03\\CopyDemo02.java"));
		OutputStreamWriter osw = 
				new OutputStreamWriter(
						new FileOutputStream("CopyDemo02.java"));
				int d = -1;
				char[] buffer = new char[1024*8];
				while((d=isr.read(buffer))!=-1) {
					osw.write(buffer,0,d);
				}
				isr.close();
				osw.close();
	}
}
