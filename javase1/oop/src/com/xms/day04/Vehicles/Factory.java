package com.xms.day04.Vehicles;

public class Factory {
	public static VehiclesFactory getInstance(String msg) {
		if("Boat".equals(msg))
			return new BoatFactory();
		if("Horse".equals(msg))
			return new HorseFactory();
		return null;
	}
}
