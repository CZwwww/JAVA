package day02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RandomAccessFileDemo01 {
	/**
	 * 将控制台输入的内容写入到note.txt文件当中
	 * 要求可以重复输入,并且原先的内容不会被覆盖
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = 
				new RandomAccessFile("note.txt", "rw");
		Scanner sc = new Scanner(System.in);
		while(true) {
			String str = sc.next();
			if("exit".equals(str)) {
				break;
			}
			raf.seek(raf.length());
			raf.writeUTF(str);
		}
		System.out.println("感谢使用");
		raf.close();
	}
}
