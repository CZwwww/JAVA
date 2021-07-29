package day04;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws  Exception {
		Person person = 
				new Person("ÕÅÈý",12,'ÄÐ');
		ObjectOutputStream oos = 
							new ObjectOutputStream(
									new FileOutputStream("Person.obj"));
		oos.writeObject(person);
		oos.close();
		ObjectInputStream ois = 
				new ObjectInputStream(
						new FileInputStream("Person.obj"));
		Person ps = (Person)ois.readObject();
		System.out.println(ps);
		ois.close();
	}
}
