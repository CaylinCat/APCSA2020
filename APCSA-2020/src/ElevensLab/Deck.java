package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
public class Deck {
	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	public static final int POINTS[] = {1,2,3,4,5,6,7,8,9,10,10,10,10};
	
	private List<Card> cards;
	private int top;
	private int size;

   //make a Deck constructor
	
	
	public Deck() {
		
		cards = new ArrayList<Card>();
	
		top = 51;

		for(int i=0; i<SUITS.length; i++) {
			for(int j=0; j<POINTS.length; j++) {
				cards.add(new Card(FACES[j+1], SUITS[i], POINTS[j]));
			}
		}
		
		size = cards.size();
	}
	
	public Deck(String[] ranks, String[] suits, int[] points) {
		
		//refer cards to new ArrayList
		cards = new ArrayList<Card>();
		//set top to the top of the deck 51
		top = 51;
		
		//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck
		for(int i=0; i<suits.length; i++) {
			for(int j=1; j<=13; j++) {
				cards.add(new Card(ranks[j+1], suits[i], points[j]));
			}
		}
		
		size = cards.size();
		//System.out.println(size);
	}
   	
   //make a dealCard() method that returns the top card
	public Card dealCard() {
		Card cardDeal = cards.get(size-1);
		size--;
		return cardDeal;
		
	}
   
   //write a shuffle() method
	public void shuffle() {
	//use Colletions.shuffle
		Collections.shuffle(cards);
   	//reset the top card 
		size = cards.size();
		top = 51;
	}
	
	
	//other methods
	public boolean isEmpty(ArrayList<Card> card) {
		if(card.size() == 0)
			return true;
		return false;
	}
	public int size() {
		return size;
	}

}