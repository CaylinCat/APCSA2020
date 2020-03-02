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
		String rank = null;
		int face = 0;
		//face is the same as point value

  	//constructors
		public Card(String rank, String suit, int face) {
			setSuit(suit);
			setRank(rank);
			setFace(face);
		}
		public Card(String suit, int face) {
			setSuit(suit);
			setFace(face);
		}
		public Card() {
			
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
		
	//methods
		public boolean testEquality(Card otherCard) {
			if(this.getSuit().equals(otherCard.getSuit()) && this.getRank().equals(otherCard.getRank()) && this.getFace() == otherCard.getFace())
				return true;
			return false;
		}


  	//toString
		public String toString() {
			if(rank==null)
				return suit + " point value = " + face;
			return rank + " of " + suit + " point value = " + face;
		}

 }