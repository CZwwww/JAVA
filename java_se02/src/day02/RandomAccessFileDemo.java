package day02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf =
				new RandomAccessFile("raf2.dat","rw");
		
		System.out.println(raf.getFilePointer());
		/*
		 * 1.将int值转换为4个字节
		 * 将数据转换为对应的字节序列的过程称为"序列化"
		 * 2.将4个字节写入文件当中
		 * 将字节写入磁盘作长久保存的过程称之为持久化
		 */
		raf.writeInt(123);
		System.out.println(raf.getFilePointer());
		raf.seek(0);
		//将字节序列转化为对应数据的过程称之为反序列化
		int i = raf.readInt();
		System.out.println(i);
//		System.out.println(raf.getFilePointer());
		String str = "我是一个字符串";
		//用该方法写字符串,双引号也会算进去
		raf.writeUTF(str);
		raf.seek(4);
		//双引号不会读出来
		System.out.println(raf.readUTF());
		raf.close();
		
	}
}
