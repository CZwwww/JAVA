package day04;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo02 {
	public static void main(String[] args) throws IOException {
		/*
		 * PrintWriter(OutputStream out)
		 */
		PrintWriter pw = 
				new PrintWriter(new FileOutputStream("pw2.txt"),true);
		pw.println("大家好");
		pw.write("再见");
	}
}
