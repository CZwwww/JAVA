package day04;

//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
//import java.io.UnsupportedEncodingException;

public class PrintWriterDemo01 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw =
				new PrintWriter("pw.txt","UTF-8");
		pw.write("´ó¼ÒºÃ");
		pw.close();
	}
}
