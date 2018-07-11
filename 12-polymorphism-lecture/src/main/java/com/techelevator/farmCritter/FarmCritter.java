package com.techelevator.farmCritter;

public abstract class FarmCritter {		// Data members
	protected String name;				//Only members of the class and subclass methods can access it
	private String sound;
	private boolean sleeping = false; // true is animal is sleeping

	public  FarmCritter(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}
	public abstract void eat();				//require any subclass to provide an eat method
	public void Sleeping() {
		sleeping=true;
	}
	public abstract String getName();		// getName is an abstract method  
											// means that the superclass is requiring the subclass to define it
	public String getSound() {
		if (sleeping) {
			return "Zzzzzz";
		} else {
			return sound;
		}
	}
	public boolean isSleeping() {
		return sleeping;
		
	}

}
