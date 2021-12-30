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
		
		
		Hand player1 = new Hand("Player");
		Hand dealer = new Hand("Dealer");
		System.out.println(player1.getHand());
		System.out.println(dealer.getHand());
		
		
		Player player = new Player();
		Player player2 = new Player();
		System.out.println(player.getHand());
		System.out.println(player2.getHand());
	}

}
