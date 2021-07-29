package com.xms.pattern.singleton;

public class Teacher {
	private static Teacher t ;
	private Teacher() {
		
	}
	public static Teacher getInstance() {
		if(t==null) {
			t = new Teacher();
		}
		return t;
	}
}
