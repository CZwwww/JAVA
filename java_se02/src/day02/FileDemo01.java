package day02;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FileDemo01 {
	/**
	 * java.io.File
	 * File���ÿһ��ʵ����������һ���ļ�
	 * ����Ŀ¼����Ϣ
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//����·������ȡ,�����ڳ���Ŀ�ƽ̨
		/*
		 * "."��ʾ���ǵ�ǰĿ¼,
		 * ����ĵ�ǰĿ¼ָ���ǵ�ǰ����������Ŀ��
		 * �ĸ�Ŀ¼
		 */
//		File file = 
//				new File(".\\test.txt");
		/*
		 * File�ĳ���separator:��ʾĿ¼�Ĳ㼶�ָ���
		 * ��windowsƽ̨��,�ó�����\
		 * ��Linuxƽ̨��,�ó�����/
		 */
		File file = new File("."+File.separator+"test.txt");
		System.out.println(file.lastModified()/3600000/365/24+1970);
		System.out.println(file.length());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss E a");
		Date d = new Date();//����һ��Date���͵�ʵ��
		d.setTime(file.lastModified());//ʹ��setTime�������ļ�����ĺ���ֵ����ʵ��d
		String time = sdf.format(d);//ͨ��SimpleDateFormat���ʵ��sdf��format����,��ʵ��d�ĺ���ֵ�Թ涨��ʽתΪString���͵�ʵ��time
		System.out.println(time);
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getCanonicalPath());
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		
	}
}
