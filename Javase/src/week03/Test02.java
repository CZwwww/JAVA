package week03;

public class Test02 {
	public static void main(String[] args) {
		String str = "ijfom@$#@$@#ck2093u2014nsaw";
		int[] count = new int[2];
		char[] arr = str.toCharArray();
		for(char c :arr) {
			if(c<='z'&&c>='a') {
				count[0]++;
			}else if(c<='9'&&c>='0'){
				count[1]++;
			}
		}
		System.out.println("�ַ�������"+count[0]+"����ĸ"+count[1]+"������");
	}
}
