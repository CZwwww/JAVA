package day03;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
	/**
	 * �߼������ܶ����Ĺ���,ֻ�ܻ�������һ����
	 * �������Ĺ���:
	 * �ڲ�ά����һ��������,���ڼ��ٶ�д����,
	 * ��߶�дЧ��
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("bos.txt");
		BufferedOutputStream bos = 
				new BufferedOutputStream(fos);
		String str = "��Һ�";
		byte[] data = str.getBytes("UTF-8");
		bos.write(data);
		/*
		 * ������ͨ�������ֽ������д�����ݺ�,
		 * û�йر���,�������ǵ�����û��д���ļ���,
		 * ����û�йر���,�����Ա����ڻ�������
		 * �ڹر�����ʱ��,����ֻ��Ҫ�ر������
		 * �ĸ߼���,�߼����ڹر��Լ�ǰ���Ȱ���
		 * ��������ر�
		 */
//		bos.close();
		/*
		 * void flush()
		 * ���������е�����д�뵽�ļ���
		 */
		bos.flush();
		bos.close();
	}
}
