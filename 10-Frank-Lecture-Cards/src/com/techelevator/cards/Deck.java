package com.techelevator.cards;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private ArrayList<Card> cardDeck = new ArrayList<Card>();
	
	public Deck()											//constructor because its the same name as the class and no return statement
	{
	for (String suit : new String [] {Card.Clubs, Card.Diamonds, Card.Spades, Card.Hearts}) // loops for each suit
		{
		for (int i = 1; i < 14; i++)														// loops 13 times
			{
			Card currentCard = new Card(i, suit);
			cardDeck.add(currentCard);
			}
		}
	}  // end of Deck()

	// shuffle deck randomly - use Collections.shuffle() static method
	public void shuffle()
	{
	Collections.shuffle(cardDeck);													//shuffle method will randomly distribute the parameters
	}  // end of shuffle()
	
	// Deal a card - Return top card from Deck
	public Card deal () {
		if (size() != 0) {
			return cardDeck.remove(0);
			}
		else {
			 return null;
			 }
	}  // end of deal()
	
	// return number cards in a Deck
	public int size() {
		return cardDeck.size();
	} // end of size()
	
	// convert deck to String
	public String toString() {
	
	String deckAsString = new String();
	
	for (Card aCard : cardDeck) {
		deckAsString = deckAsString + aCard + "\n";
		}
	return deckAsString;
	}	// end of toString()

}  // end class Deck
