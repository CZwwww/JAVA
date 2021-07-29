package com.xms.day04.car;
/**
 * 一个Car类，有属性temperature（温度，车内Air（空调），
 * 有吹风的功能flow，Air会监视车内的温度，如果温度超过40度则吹冷气。
 * 如果温度低于0度则吹暖气，如果在这之间则关掉空调。实例化具有不同温度的Car对象，
 * 调用空调的flow方法，测试空调吹的风是否正确
 * @author Czw
 *
 */
public class Car {
	private int temperature;
	private Air air= new Air(this);
	public Car() {
		
	}
	public Car(int temperature) {
		this.temperature = temperature;
	}
	public int getTemperature() {
		return temperature;
	}
	public Air getAir() {
		return air;
	}
}
class Air{
	private Car c;
	public Air(){
		
	}
	public Air(Car c){
		this.c = c;
	}
	void flow() {
		if(c.getTemperature()<0) {
			System.out.println("呜呜,吹暖气");
		}else if(c.getTemperature()<40) {
			System.out.println("不吹气");
		}else {	
			System.out.println("吹冷气");
		}
	}
}