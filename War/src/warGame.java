
public class warGame {

	public static void main(String[] args) {
		//////////////Set Up////////////////
		Deck deck = new Deck(); 
		
		deck.shuffle();
		
		Pile p1 = new Pile();
		Deck subDeck = deck.subDeck(0,25);
		p1.addDeck(subDeck);
		
		Pile p2 = new Pile();
		subDeck = deck.subDeck(26,51);
		p2.addDeck(subDeck);
		
		Pile midPile = new Pile();
		
		
		Pile winP1 = new Pile();
		
		Pile winP2 = new Pile();
		
		//////////Logic//////////////////
		
		while(!p1.isEmpty() && !p2.isEmpty()) {
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();
			
			midPile.addCard(c1);
			midPile.addCard(c2);
			
			int compareResult = c1.compareTo(c2);
			
			if (compareResult > 0) {
				System.out.println("P1 Took the Hand");
				winP1.addPile(midPile);
			}
			else if (compareResult < 0) {
				System.out.println("P2 Took the Hand");
				winP2.addPile(midPile);
			}
			else {
				System.out.println("Tie Hand");
			}
		}
		
		//////////Cards are spent/////////////
		if(winP1.size()>winP2.size()) {
			System.out.println("Player 1 Wins");
		}
		else if (winP1.size()<winP2.size()) {
			System.out.println("Player 2 Wins");
		}
		else {
			System.out.println("Tie!");
		}
	}
}
