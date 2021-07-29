package com.xms.singleton;

public class Teacher {
	private static Teacher t = new Teacher();
	public static Teacher getInstance() {
		return t;
	}
}
