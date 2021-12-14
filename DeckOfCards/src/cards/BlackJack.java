package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BlackJack {
	private ArrayList<Card> dealerHand;
	private ArrayList<Card> playerHand;
	DeckOfCards deck = new DeckOfCards();
	public BlackJack() {
		
		deck.shuffleDeck();
		
		
	}
	
	public BlackJack(ArrayList<Card> dealerHand, ArrayList<Card> playerHand) {
		deck.shuffleDeck();
		this.setDealerHand(dealerHand);
		this.setPlayerHand(playerHand);
		
	}
	


	public ArrayList<Card> getPlayerHand() {
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
		this.dealerHand = dealerHand;
	}
	
	public String toString() {
		return String.format("%s", playerHand);
	}

}
