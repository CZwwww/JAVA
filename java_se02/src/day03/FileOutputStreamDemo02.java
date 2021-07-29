package day03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo02 {
	//文件字节输出流
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = 
				new FileOutputStream("fos.dat",true);
		//当重新写入内容时,该文件原先的内容被全部废弃
		fos.write('B');
		fos.close();
	}
}
