import java.util.Scanner;

/****************************
 * 		Dabloon Method 		*
 ***************************/
public class dabloon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;

		System.out.println("Insert String: ");
		Scanner input = new Scanner(System.in);
		str = input.next();
		System.out.println(isDabloon(str));

	}

	public static boolean isDabloon(String str) {

		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count != 2) {
				return false;
			}
		}
		return true;
	}
}
