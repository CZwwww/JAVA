package day03;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputDemo {
	//DOS:�ø߼��������Ķ��⹦���Ƿ�������д��
			//������������
	public static void main(String[] args) throws IOException {
		DataOutputStream dos = 
				new DataOutputStream(
						new FileOutputStream("dos.dat"));
		dos.writeInt(123);
		dos.writeLong(123L);
		dos.writeDouble(12.34);
		dos.writeUTF("���");
		dos.close();
	}
}
