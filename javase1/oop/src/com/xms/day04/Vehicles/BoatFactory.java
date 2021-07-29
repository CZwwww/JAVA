package com.xms.day04.Vehicles;

public class BoatFactory implements VehiclesFactory{

	@Override
	public Vehicles getInstance() {
		// TODO Auto-generated method stub
		return new Boat();
	}

}
