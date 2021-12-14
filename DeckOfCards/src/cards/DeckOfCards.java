package cards;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
	private ArrayList<Card> deck;
	private Image backOfCardImage;
	
	//private Image backOfCardImage;
	
	/*
	 * Define the class
	 * define the instance variables
	 * create construtor - define the obkject in the system
	 * creat get/set methods
	 * create any custom methos
	 */
	
	public DeckOfCards(ArrayList<Card> deck) {
		this.deck = deck;
	}
	
	public DeckOfCards() {
		List<String> suits = Card.getValidSuit();
		List<String> values = Card.getValidValue();
		
		deck = new ArrayList<>();
		
		for(String suit: suits) {
			for (String value: values) {
				deck.add(new Card(value, suit));
			}
		}
	}
	
	public String toString() {
		return String.format("%s", deck);
	}
	
	public Card dealCard() {
		if (deck.size() > 0) {
			return deck.remove(0);
		}else{
			//Runs out of cards to deal
			System.out.println("Done");
			return null;
		}
	}
	
	public ArrayList<Card> shuffleDeck() {
		ArrayList<Card> newDeck = new ArrayList<Card>();
		
		while (deck.size() > 0) {
			int index = (int) (Math.random() * deck.size());
			newDeck.add(deck.remove(index));
		}
		deck = newDeck;
		return deck;
	}
	
	

}
