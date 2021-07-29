package day03;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamDemo {
	public static void main(String[] args) throws IOException {
		DataInputStream dis =
				new DataInputStream(
						new FileInputStream("dos.dat"));
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
		dis.close();
	}
}
