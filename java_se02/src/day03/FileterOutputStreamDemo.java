package day03;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileterOutputStreamDemo {
	/**
	 * �߼����Ĺ��ܿ��Ե���ʹ��,
	 * ���Ǽ�Ҫ���Է����д���������͵�����,
	 * ��Ҫд��Ч�ʸ�,��ô���ǿ�������DOS��
	 * BOSһ��ʹ��
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
