package day02;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FileDemo01 {
	/**
	 * java.io.File
	 * File类的每一个实例用于描述一个文件
	 * 或者目录的信息
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//绝对路径不可取,不易于程序的跨平台
		/*
		 * "."表示的是当前目录,
		 * 这里的当前目录指的是当前程序所在项目的
		 * 的根目录
		 */
//		File file = 
//				new File(".\\test.txt");
		/*
		 * File的常量separator:表示目录的层级分隔符
		 * 在windows平台下,该常量是\
		 * 在Linux平台下,该常量是/
		 */
		File file = new File("."+File.separator+"test.txt");
		System.out.println(file.lastModified()/3600000/365/24+1970);
		System.out.println(file.length());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss E a");
		Date d = new Date();//创建一个Date类型的实例
		d.setTime(file.lastModified());//使用setTime方法将文件保存的毫秒值赋给实例d
		String time = sdf.format(d);//通过SimpleDateFormat类的实例sdf的format方法,将实例d的毫秒值以规定格式转为String类型的实例time
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
