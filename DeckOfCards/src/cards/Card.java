package cards;

import java.awt.Image;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Card {
	private String value, suit;
	private ImageIcon image;
	
	public Card(String value, String suit){
		setValue(value);
		setSuit(suit);
		String fileName = value + "_of_" + suit + ".png";
		image = new ImageIcon(DeckView.class.getResource("/Resource/" + fileName));
		
	}
	
	public String getValue(String value) {
		return value;
	}
	
	/**
	 * This method will validate the argument and set the instance variable
	 * @param value ace,2,3,4,5,6,7,8,9,10,jack,queen,king
	 */
	public void setValue(String value) {
		
		List<String>validValue = getValidValue();
		value = value.toLowerCase();
		if (validValue.contains(value))
			this.value = value;
		else
			throw new IllegalArgumentException("Valid values are : " + validValue);
	}
	
	
	public String getSuit(String suit) {
		
		return suit;
	}
	
	public void setSuit(String suit) {
		List<String>validSuit = getValidSuit();
		suit = suit.toLowerCase();
		if (validSuit.contains(suit))
			this.suit = suit;
		else
			throw new IllegalArgumentException("Valid values are : " + validSuit);
	}
	
	public static List<String> getValidValue(){
		return Arrays.asList("ace","2","3","4","5","6","7","8","9","10","jack","queen","king");
	}
	
	public static List<String> getValidSuit(){
		return Arrays.asList("hearts","diamonds","spades","clubs");
	}
	
	public String toString() {
		return String.format("%s of %s", value, suit);
	}

	public ImageIcon getImage() {
		return image;
	}

	public void setImage(ImageIcon imageIcon) {
		this.image = imageIcon;
	}
	

}
