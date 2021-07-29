package com.xms.day04.Vehicles;

public class HorseFactory implements VehiclesFactory{

	@Override
	public Vehicles getInstance() {
		// TODO Auto-generated method stub
		return new Horse();
	}
	
}
