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
			for(int f=1; f<=13; f++) {
				cards.add(new Card(FACES[f],SUITS[i], f));
			}
		}
		
		size = cards.size();
	}
	
	public Deck(String[] ranks, String[] suits, int[] points) {
		
		//refer cards to new ArrayList
		cards = new ArrayList<Card>();
		//set top to the top of the deck 51
		//top = 51;
		
		//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck
		for(int i=0; i<suits.length; i++) {
			for(int j=0; j<ranks.length; j++) {
				cards.add(new Card(ranks[j], suits[i], points[j]));
			}
		}
		
		size = cards.size();
		top = size-1;
		shuffle();
		//System.out.println(size);
	}
   	
   //make a dealCard() method that returns the top card
	public Card dealCard() {
		Card topCard;
		if(!isEmpty())
			topCard = cards.get(top);
		else {
			return new Card();
		}
		top--;
		size--;
		return topCard;
		
	}
   
   //write a shuffle() method
	public void shuffle() {
	//use Colletions.shuffle
		Collections.shuffle(cards);
   	//reset the top card 
		size = cards.size();
		top = size-1;
	}
	
	
	//other methods
	public boolean isEmpty() {
		return size==0;
	}
	public int size() {
		return size;
	}
	public void resetTop() {
		size = cards.size();
		top = size - 1;
	}

}