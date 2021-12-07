package cards;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
	private ArrayList<Card> deck;
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


}