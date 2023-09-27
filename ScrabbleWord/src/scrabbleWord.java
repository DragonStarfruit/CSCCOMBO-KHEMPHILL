/****************************
 * 	Scrabble Word Checker 	*
 ***************************/
import java.util.Scanner;

public class scrabbleWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String tiles, word;
		System.out.println("Enter tiles: ");
		tiles = input.next();
		//tiles = "aybtbla";
		System.out.println("Enter word: ");
		word = input.next();
		//word = "abba";
		System.out.println(wordCheck(word, tiles));
	}

	public static boolean wordCheck(String word, String tiles) {
		for (int i = 0; i < word.length(); i++) {
			int count = 0;
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					count++;
				}

			}
			for (int k = 0; k < tiles.length(); k++) {
				if (word.charAt(i) == tiles.charAt(k)) {
					count--;
				}
				
			}
			if (count > 0) {
				return false;
			}
		}
		return true;
	}

}
