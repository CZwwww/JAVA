package day04;

import java.io.BufferedWriter;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = 
				new BufferedWriter(
						new OutputStreamWriter(
								new FileOutputStream("bw.txt",true),"UTF-8"));
		bw.write("ÄãºÃ");
		bw.close();
	}
}
