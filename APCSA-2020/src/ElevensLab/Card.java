package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		String suit = "";
		String rank = "";
		int face = 0;

  	//constructors
		public Card(String rank, String suit, int face) {
			setSuit(suit);
			setRank(rank);
			setFace(face);
		}


	// modifiers
		//set methods
		public void setSuit(String suit) {
			this.suit = suit;
		}
		public void setRank(String rank) {
			this.rank = rank;
		}
		public void setFace(int face) {
			this.face = face;
		}


  	//accessors
		//get methods
		public String getSuit() {
			return suit;
		}
		public String getRank() {
			return rank;
		}
		public int getFace() {
			return face;
		}


  	//toString

 }