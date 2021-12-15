package cards;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BlackJack {
	private ArrayList<Card> dealerHand = new ArrayList<Card>();;
	private ArrayList<Card> playerHand = new ArrayList<Card>();;
	DeckOfCards deck = new DeckOfCards();
	public BlackJack() {
		
		deck.shuffleDeck();
		setDealerHand(dealerHand);
		setPlayerHand(playerHand);
		
	}
	
	/*public BlackJack(ArrayList<Card> dealerHand, ArrayList<Card> playerHand) {
		
		
		
	}*/

	public ArrayList<Card> getPlayerHand() {
		//System.out.println(deck.dealCard());
		return playerHand;
	}

	public void setPlayerHand(ArrayList<Card> playerHand) {
		for (int i = 0; i < 2; i++) {
			playerHand.add(deck.dealCard());
		}
		
		this.playerHand = playerHand;
	}

	public ArrayList<Card> getDealerHand() {
		return dealerHand;
	}

	public void setDealerHand(ArrayList<Card> dealerHand) {
		for (int i = 0; i < 2; i++) {
			dealerHand.add(deck.dealCard());
		}
		this.dealerHand = dealerHand;
	}
	
	public String toString() {
		return String.format("%s", playerHand);
	}

}
