package com.techelevator.cards;

public class Card {
	// member data for class
	private int cardValue;
	private String cardName;
	private String cardSuit;
	private String cardColor;
	private String cardBackColor;

	public final static String Clubs = "Clubs";
	public final static String Spades = "Spades";
	public final static String Diamonds = "Diamonds";
	public final static String Hearts = "Hearts";

	// method members for class
	@Override
	public String toString() 		// return a String object made from a card
	{
		return ("Value: " + cardValue + " Suit: " + cardSuit + " Color: " + cardColor);
	}

	// 2-arg ctor
	public Card(int value, String suit) {
		this.cardValue = value;
		this.cardBackColor = "Blue"; // set default back color to Blue

		if (isSuitValid(suit)) {
			this.cardSuit = suit;
			this.determineColor();
		} else {
			this.cardSuit = null;
			this.cardColor = null;
		}
	}

	// method to validate suit
	// return true if its valid and false
	private boolean isSuitValid(String suit) {
		if (suit.equals(Clubs) || suit.equals(Spades) || suit.equals(Hearts) || suit.equals(Diamonds)) {
			return true;
		} else {
			return false;
		}
	}

	// method to determine color based on suit
	private void determineColor() {
		if (cardSuit.equals("Clubs") || cardSuit.equals("Spades")) {
			cardColor = "Black";
		} else {
			cardColor = "Red";
		}
	}

	// method to display the attributes of a Card
	public void showCard() {
		System.out.println("Value: " + cardValue);
		System.out.println(" Name: " + cardName);
		System.out.println(" Suit: " + cardSuit);
		System.out.println("Color: " + cardColor);
		System.out.println(" Back: " + cardBackColor);
	}

}
