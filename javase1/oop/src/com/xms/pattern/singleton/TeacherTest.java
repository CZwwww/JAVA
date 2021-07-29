package com.xms.pattern.singleton;

public class TeacherTest {
	public static void main(String[] args) {
		new Thread(){public void run() {
			Teacher t1 = Teacher.getInstance();
			System.out.println(t1);
		}}.start();
		new Thread() {
			public void run() {
				Teacher t2 = Teacher.getInstance();
				System.out.println(t2);
			}
		}.start();
	}
}
