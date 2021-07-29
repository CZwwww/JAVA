package week03;

import java.math.BigInteger;

public class Test04 {
	public static void main(String[] args) {
		BigInteger a =BigInteger.valueOf(0);
		BigInteger b =BigInteger.valueOf(0);
		for(int i = 0;i<10;i++) {
			a = a.multiply(BigInteger.valueOf(10));
			a = a.add(BigInteger.valueOf(4));
			b = b.add(a);
			System.out.println(a);
		}
		System.out.println(b);
	}
}
