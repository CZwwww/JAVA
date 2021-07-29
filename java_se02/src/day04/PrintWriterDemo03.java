package day04;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
//import java.io.UnsupportedEncodingException;

public class PrintWriterDemo03 {
	public static void main(String[] args) throws IOException {
		/*
		 * PrintWriter(Writer writer)
		 * PrintWriter(Writer writer,boolean autoFlush)
		 */
		PrintWriter pw = 
				new PrintWriter(
						new OutputStreamWriter(
								new FileOutputStream("pw3.txt",true),
								"UTF-8"),
						true);
		pw.println("Œ“∞Æjava");
		pw.close();
	}
}
