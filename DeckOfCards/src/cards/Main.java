package cards;

import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Card card1 = new Card("ace", "Spades");
		System.out.println(card1);
		
		//invalid card
		Card card2 = new Card("ace", "Spasdes");
		System.out.println(card2);
		*/
		
		//DeckOfCards deck = new DeckOfCards();
		
		//System.out.println(deck);
		
		BlackJack game = new BlackJack();
		System.out.println(game.deck);
		System.out.println("Player Hand " + game.getPlayerHand());
		System.out.println("Dealer Hand " + game.getDealerHand());
		

	}

}
