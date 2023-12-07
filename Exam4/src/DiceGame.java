import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numPlayers; 
		String name; 
		
		System.out.println("What dice would you like to use for the game?(sides)");
		int numSides = input.nextInt();
		Die die = new Die(numSides); 
		
		System.out.println("How many players?");
		numPlayers = input.nextInt();
		Player[] players = new Player[numPlayers];
		
		for (int i = 0; i<numPlayers; i++) {
			System.out.println("what is player's " + (i+1)  + " name?");
			name = input.next();
			players[i] = new Player(name, die); 
		}
		
		for (int i = 0; i<players.length; i++) {
			int rolledNum = 0; 
			int highestRoll = 0; 
			rolledNum = die.roll(die.getNumSides());
			if (rolledNum > highestRoll) {
				highestRoll = rolledNum; 
			}
			System.out.println(players[i].getName() + " rolled a " + rolledNum + " on a d" + die.getNumSides());
		}
		
		
		System.out.println("the winner is " + players[decideWinner(players)].getName() + "!!!!");
	}

	public static int decideWinner(Player[] players) {
		int winner = 0;
		for (int i = 0; i<players.length-1; i++) {

			if (players[i].getDie().getValue() > players[i+1].getDie().getValue()) {
				i = winner; 
			}
		}
		return winner; 
		
	}
}
