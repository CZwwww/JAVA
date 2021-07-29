package day03;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputDemo {
	//DOS:该高级流带来的额外功能是方便我们写出
			//基本类型数据
	public static void main(String[] args) throws IOException {
		DataOutputStream dos = 
				new DataOutputStream(
						new FileOutputStream("dos.dat"));
		dos.writeInt(123);
		dos.writeLong(123L);
		dos.writeDouble(12.34);
		dos.writeUTF("你好");
		dos.close();
	}
}
