import java.util.Arrays;

public class Deck {
	private final int NUMBER_OF_CARDS = 52; 
	Card[] cards = new Card[NUMBER_OF_CARDS];
	
	public Deck () {
		int count = 0;
		for (int i = 0; i<4; i++) {
			for (int j = 1; j<14; j++, count++) {
				cards[count] = new Card(j, i);
			}
		}
	}
	
	@Override
	public String toString() {
		return "Current order of deck:" + Arrays.toString(cards);
	}


	
	
}
