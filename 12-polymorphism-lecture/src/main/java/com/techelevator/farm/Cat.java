package com.techelevator.farm;

public class Cat extends FarmAnimal{
	public Cat() {
		super("Cat", "meow");
	}
	//Cannot be overriden due to the Final on superclass method
	@Override
	public String getSound() {
		if(isSleeping()) {
			return "Purrrrr";
		}
		else {
			return this.getSound();
		}
	}

}
