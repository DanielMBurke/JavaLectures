package com.techelevator.farm;

public class FarmAnimal implements IFarmAnimal {
	// Data members
	private String name;
	private String sound;
	private boolean sleeping = false; // true is animal is sleeping

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public void Sleeping() {
		sleeping=true;
	}
	@Override
	public String getName() {
		return name;
	}
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