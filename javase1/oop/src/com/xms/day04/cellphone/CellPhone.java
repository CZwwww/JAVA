package com.xms.day04.cellphone;

public class CellPhone {
	private Clock clk = new Clock();
	private Calculator calc = new Calculator();
	
	private class Clock {
		public void work() {
			System.out.println("计时");
	}
}
private class Calculator{
	public void work() {
		System.out.println("计算");
		}
	}
	
	public CellPhone(){
		
	}
	
	public void work() {
		clk.work();
		calc.work();
	}
}

