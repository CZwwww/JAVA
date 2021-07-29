package day02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		raf.write(300);
		raf.write('A');
		raf.write('B');
		String str = "大家好!";
		byte[] strData = str.getBytes("UTF-8");
		raf.write(strData);
		int max = Integer.MAX_VALUE;
		raf.write(max>>>24);
		raf.write(max>>>16);
		raf.write(max>>>8);
		raf.write(max);
		raf.writeInt(300);
		raf.writeLong(100L);
		raf.writeChar('中');
		raf.writeDouble(12.3);
		raf.close();
	}
}
