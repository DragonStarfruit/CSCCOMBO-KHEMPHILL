import java.util.Arrays;
import java.util.Random;

public class Deck {
	private final int NUMBER_OF_CARDS = 52; 
	Card[] cards = new Card[NUMBER_OF_CARDS];
	private static Random rand= new Random();
	
	public Deck () {
		int count = 0;
		for (int i = 0; i<4; i++) {
			for (int j = 1; j<14; j++, count++) {
				cards[count] = new Card(j, i);
			}
		}
	}
	
	public Deck(int numCards) {
		cards = new Card[numCards];
	}
	
//	@Override
//	public String toString() {
//		return "Current order of deck:" + Arrays.toString(cards);
//	}
	
	//shuffle
	public void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			int index = rand.nextInt(cards.length);
			swap(i,index);
		}
	}
	
	// get/set cards
	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	
	//Shuffle
	public static void shuffle(Deck deck) {
		Card[] cards = deck.getCards();
		for (int i = 0; i < cards.length; i++) {
			int index = rand.nextInt(cards.length);
			Card temp = cards[i];
			cards[i] = cards[index];
			cards[index] = temp; 
		}
	}
	
	//Swap
	private void swap(int a, int b) {
		Card temp = cards[a];
		cards[a] = cards[b];
		cards[b] = temp; 
	}
	
	private static void swapDeckCards(Card[] cards, int a, int b) {
		Card temp = cards[a];
		cards[a] = cards[b];
		cards[b] = temp; 
	}
	
	//Bubble Sort
	public void bubbleSort() {
		for (int i = 0; i < cards.length-1; i++) {
			for (int j = 1; j < cards.length-i; j++) {
				if (cards[j-1].compareTo(cards[j])>0) {
					swap(j-1, j);
				}
			}
		}
	}
	
	public static void bubbleSort(Deck deck) {
		Card[] cards = deck.getCards();
		for (int i = 0; i < cards.length-1; i++) {
			for (int j = 1; j < cards.length-i; j++) {
				if (cards[j-1].compareTo(cards[j])>0) {
					swapDeckCards(cards, j-1, j);
				}
			}
		}
	}
	
	public Deck subDeck(int start, int end) {
		Deck subDeck = new Deck(end - start);
		for (int i = start, j = 0; i<end; i++, j++) {
			subDeck.cards[j] = cards[i]; 
		}
		return subDeck; 
	}
	
	public void selectsort(Deck deck) {
		  for (int i=0; i<cards.length-1; i++) {     
		    int bigindex = 0;                      
		    for (int j=1; j<cards.length-i; j++)       
		      if (cards[j].compareTo(cards[bigindex]) > 0)  
		        bigindex = j;                     
		    swapDeckCards(cards, bigindex, cards.length-i-1);  
		  }
		}
	
	
	//to String
	@Override
	public String toString() {
		StringBuilder retStr = new StringBuilder();
		for (int i = 0; i < cards.length; i++) {
			retStr.append(cards[i].toString());
			retStr.append(", ");
			if (i%12 == 0 && i != 0)retStr.append("\n");
		}
		return retStr.toString();
	} 

}
