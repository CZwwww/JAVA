package day02;

import java.io.File;

public class FileDemo02 {
	/**
	 * �ڵ�ǰĿ¼�´���һ��demoĿ¼
	 */
	public static void main(String[] args) {
		//����File��������������Ҫ������Ŀ¼
		//.�ͷָ�������ʡ��,Ĭ�Ͼ��ǵ�ǰĿ¼
//		File dir = new File("."+File.separator+"demo");
		File dir = new File("demo");
		if(!dir.exists()) {
			dir.mkdir();
		}
		
	}
}
