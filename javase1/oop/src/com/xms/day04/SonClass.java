package com.xms.day04;


public class SonClass extends FatherClass{	
	public SonClass(){
		System.out.println("Son");
	}
	public static void main(String[] args) {
		FatherClass fc = new FatherClass();
		SonClass sc = new SonClass();
	}
}
