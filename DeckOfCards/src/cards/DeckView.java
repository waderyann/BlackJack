package cards;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class DeckView {

	private JFrame frame;
	
	private JLabel DeckImageView;
	int count = 0;
	
	
	DeckOfCards deck = new DeckOfCards();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeckView window = new DeckView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DeckView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 816, 904);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		DeckImageView = new JLabel("");
		DeckImageView.setIcon(null);
		DeckImageView.setBounds(127, 37, 500, 726);
		frame.getContentPane().add(DeckImageView);
		
		deck.shuffleDeck();
		System.out.println(deck.shuffleDeck());
		
		
		JButton nextCard = new JButton("Next Card");
		nextCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeckImageView.setIcon(deck.dealCard().getImage());
				System.out.println(count);
				count++;
			}
		});
		nextCard.setBounds(346, 814, 89, 23);
		frame.getContentPane().add(nextCard);
	}
}
