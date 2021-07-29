package com.xms.day04.Instrument;

public class InstrumentTest {
	public static void main(String[] args) {
		Instrument is = new Piano();
		Instrument is1 = new Violin();
		is.play();
		is1.play();
	}
	public static void testPlay(Instrument is) {
		is.play();
	}
}
