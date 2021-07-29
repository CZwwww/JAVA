package day03;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileterOutputStreamDemo {
	/**
	 * 高级流的功能可以叠加使用,
	 * 我们既要可以方便的写出基本类型的数据,
	 * 又要写的效率高,那么我们可以联合DOS和
	 * BOS一起使用
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		DataOutputStream dos = 
				new DataOutputStream(
						new BufferedOutputStream(
								new FileOutputStream("dos.dat")));
		dos.writeInt(12356);
		dos.flush();
		dos.close();
	}
}
