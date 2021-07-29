package day03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//创建用于读源文件的bis
		BufferedInputStream bis = 
				new BufferedInputStream(
						new FileInputStream("tomcat.rar"));
		//创建用于写复件的BOS
		BufferedOutputStream bos = 
				new BufferedOutputStream(
						new FileOutputStream("tomcatCopy4.rar"));
		//边读边写
		int d = -1;
		while((d = bis.read())!=-1) {
			bos.write(d);
		}
		bis.close();
		bos.close();
	}
}
