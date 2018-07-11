package com.techelevator.cards;

public class TestCardProgram {

	public static void main(String[] args) {
	
		// Create an instance of a Card
		// Create  a three of clubs
		// value, suit,    backColor
	
		Card threeClub  = new Card(3, Card.Clubs);
		Card threeHeart = new Card(3, Card.Hearts);
		
		System.out.println("Test showCard() method...");
		threeClub.showCard();
		threeHeart.showCard();
		System.out.println("End of Test showCard() method\n");
  
		System.out.println("Test toString() method...");
		System.out.println(threeClub.toString());  // convert an object to a string
		System.out.println("End of Test toString() method\n");

		Deck myDeck = new Deck();
		myDeck.shuffle();
		
		System.out.println("Testing Deck methods...\n");
		System.out.println("deal() methods tests...\n");
		
		System.out.println("Card dealt: " + myDeck.deal());
		System.out.println("Card dealt: " + myDeck.deal());
		System.out.println("Card dealt: " + myDeck.deal());
		System.out.println("Card dealt: " + myDeck.deal());
		System.out.println("Card dealt: " + myDeck.deal());	
		
		System.out.println("End of deal() methods tests...\n");
		
		System.out.println("Test toString() method...\n");
		System.out.println("Deck as String:\n" + myDeck);
		
		System.out.println("End of Test Deck methods\n");

		
	} // end of main

} // end class TestCardProgram
