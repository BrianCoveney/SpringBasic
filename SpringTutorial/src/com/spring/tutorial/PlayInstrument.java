package com.spring.tutorial;

public class PlayInstrument {
	
	Instrument instrument;
	PlayInstrument(Instrument instrument){
		this.instrument = instrument;
	}
	
	public void playedInstrument()
	{
		System.out.println(instrument.sound());
	}

}
