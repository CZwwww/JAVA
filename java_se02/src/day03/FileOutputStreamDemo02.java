package day03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo02 {
	//�ļ��ֽ������
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = 
				new FileOutputStream("fos.dat",true);
		//������д������ʱ,���ļ�ԭ�ȵ����ݱ�ȫ������
		fos.write('B');
		fos.close();
	}
}
