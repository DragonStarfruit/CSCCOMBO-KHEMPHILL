import java.util.Scanner;

public class countingVowelsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int countVowel = 0;
		String str;

		System.out.println("Input String: ");
		str = input.next();
		System.out.println("Number of vowels: " + countVowel(countVowel, str));
	}

	public static int countVowel(int countVowel, String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}
			else if (str.charAt(i) == 'e') {
				count++;
			}
			else if (str.charAt(i) == 'i') {
				count++;
			}
			else if (str.charAt(i) == 'o') {
				count++;
			}
			else if (str.charAt(i) == 'u') {
				count++;
			}
		}
		return count; 
	}
}
