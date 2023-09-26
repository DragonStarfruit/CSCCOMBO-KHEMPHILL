import java.util.Scanner;

public class middleNumberMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str;
		System.out.println("Input string: ");
		str = input.next();
		System.out.println(middleChar(str));
	}

	public static String middleChar(String str) {
		if (str.length() % 2 == 0) {
			return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
		} else {
			return str.substring(str.length() / 2, str.length() / 2 + 1);
		}
	}
}
