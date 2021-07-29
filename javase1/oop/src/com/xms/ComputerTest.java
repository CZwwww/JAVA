package com.xms;

public class ComputerTest {
	public static void main(String[] args) {
		Computer cp = new Computer(() -> {
			// TODO Auto-generated method stub
			System.out.println("我是台式显示器");
		});
		Computer cp1 = new Computer(() -> {
			// TODO Auto-generated method stub
			System.out.println("我是液晶显示器");
		});
		cp.getGc().show();

		cp1.getGc().show();

	}
	
}
