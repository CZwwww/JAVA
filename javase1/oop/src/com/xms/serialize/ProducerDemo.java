package com.xms.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//import java.io.OutputStream;
import java.io.Serializable;

//import com.xms.unSerializable.Person;



public class ProducerDemo {
	public static void main(String[] args) throws Exception {
//		serialize(new Person(), "Person.bin"); 将Person对象序列化 2
		Person p = (Person)unSerialize("Person.bin");//解除序列化 4
		System.out.println(p.name);//打印name发现是序列化前构造器赋予name变量的值"混世魔王",即如果final修饰的值
		//没有初值,jvm不会重新执行构造器,而是直接将数据流内的值原封不动的转换
	}
	//对象解除序列化方法
	static Object unSerialize(String fileName) throws Exception {
		ObjectInputStream ois = 
				new ObjectInputStream(
						new FileInputStream(fileName));
				Object obj = ois.readObject();				
				ois.close();
				return obj;
	}
	//序列化对象方法
	static void serialize(Serializable s,String fileName) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = 
				new ObjectOutputStream(
						new FileOutputStream(fileName));
		oos.writeObject(s);
		oos.close();
	}
	
}

class Person implements Serializable{
	private static final long serialVersionUID = -4991964577402566929L;
	public final  String name ;
	Person(){
//		name = "混世魔王"; //序列化前构造器效果 1
		name = "XJP";//在对象序列化后变更类构造器内容 3
	}
}

