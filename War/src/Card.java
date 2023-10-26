
public class Card {
	//vars
	private int rank; 
	private int suit;
	
	private final String[] RANKS = {null, "Ace", "2", "3", "4", "5"
								, "6", "7", "8", "9", "10"
								, "Jack", "Queen", "King"};
	private final String[] SUITS = {"Spades", "Hearts", "Clubs", "Diamonds"};
	
	//constructors 
	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}
	// getters and setters 
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	@Override
	public String toString() {
		return RANKS[rank] + " of " + SUITS[suit];
	} 
	
	
}