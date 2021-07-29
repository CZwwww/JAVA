package day03;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
	/**
	 * 高级流不能独立的工作,只能基于另外一个流
	 * 缓存流的功能:
	 * 内部维护了一个缓存区,用于减少读写次数,
	 * 提高读写效率
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("bos.txt");
		BufferedOutputStream bos = 
				new BufferedOutputStream(fos);
		String str = "大家好";
		byte[] data = str.getBytes("UTF-8");
		bos.write(data);
		/*
		 * 当我们通过缓存字节输出流写出数据后,
		 * 没有关闭流,发现我们的数据没有写到文件中,
		 * 若是没有关闭流,数据仍保存在缓冲区中
		 * 在关闭流的时候,我们只需要关闭最外层
		 * 的高级流,高级流在关闭自己前会先把他
		 * 处理的流关闭
		 */
//		bos.close();
		/*
		 * void flush()
		 * 将缓存区中的数据写入到文件中
		 */
		bos.flush();
		bos.close();
	}
}
