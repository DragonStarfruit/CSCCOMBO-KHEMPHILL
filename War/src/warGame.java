
public class warGame {

	public static void main(String[] args) {
		Card card1 = new Card(11,0);
		System.out.println(card1);
		System.out.println();
		
//		Deck deck2 = new Deck(); 
		
		Deck deck = new Deck();
		System.out.println(deck);
		
		deck.shuffle();
		System.out.println();
		System.out.println(deck);
		
		deck.bubbleSort();
//		Deck.bubbleSort(deck2);
		System.out.println();
		System.out.println(deck);
//		System.out.println(deck2);
	}

}
