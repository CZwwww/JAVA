package com.xms.day02;
/**
 * 编程4：
编写一个Java应用程序，设计一个汽车类Vehicle，包含的属性车轮个数wheels和车重weight。小车类Car是Vehicle的子类，其中包含的属性载人数loader。卡车类Truck是Car类的子类，其中包含的属性载重量payload。
（1每个类都构造方法进行属性初识化
（2每个类都输出相关数据的toString方法
（3使用Test类中的main方法定义各类初始化数据后台打印相关数据
 * @author Administrator
 *
 */
public class Vehicle {
	private int wheels;
	private double weight;
	public Vehicle() {
		
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Vehicle [wheels=" + wheels + ", weight=" + weight + "]";
	}
	public Vehicle(int wheels, double weight) {
		super();
		this.wheels = wheels;
		this.weight = weight;
	}
	public int getLoader() {
		return 0;
		
	}
	public double getPayload() {
		return 0;
		
	}
}
class Car extends Vehicle{
	private int loader;
	
	public int getLoader() {
		return loader;
	}

	public void setLoader(int loader) {
		this.loader = loader;
	}

	@Override
	public String toString() {
		return super.toString()+"Car [Loader=" + loader + "]";
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int wheels, double weight,int loader) {
		super(wheels, weight);
		this.loader = loader;
		// TODO Auto-generated constructor stub
	}

	
}
class Truck extends Car{
	private double payLoad;

	public double getPayLoad() {
		return payLoad;
	}

	public void setPayLoad(double payLoad) {
		this.payLoad = payLoad;
	}

	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Truck(int wheels, double weight, int loader,double payload) {
		super(wheels, weight, loader);
		this.payLoad = payload;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+"Truck [payLoad=" + payLoad + "]";
	}

	
	
}
