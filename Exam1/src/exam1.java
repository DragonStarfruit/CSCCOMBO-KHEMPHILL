import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// Print message
		System.out.println("This is my first programming test");

		// Beverage Selector (see method)
		int bev;
		System.out.println("What beverage would you like: (1)Water, (2)Coke, (3)Coffee");
		bev = input.nextInt();
		System.out.println(bevSelc(bev));

		// TenMaker (see method)
		int num1, num2;
		System.out.println("Pick Integer one: ");
		num1 = input.nextInt();
		System.out.println("Input Integer two: ");
		num2 = input.nextInt();
		System.out.println(makes10(num1, num2));

		// PrintNumber
		int count = 19;
		for (int i = 5; i <= count; i++) {
			System.out.println(i);
		}

		// Accumulator
		int num, total = 0;
		System.out.println("Enter a number: ");
		num = input.nextInt();
		total = total + num;
		while (num != 0) {
			System.out.println("Enter a number: ");
			num = input.nextInt();
			total = total + num;
		}
		System.out.println("Your total is: " + total);

	}

	// Beverage Selector (method)
	public static String bevSelc(int bev) {
		if (bev == 1) {
			return "water";
		} else if (bev == 2) {
			return "coke";
		} else {
			return "coffee";
		}
	}

	// TenMaker (method)
	public static boolean makes10(int num1, int num2) {
		if (num1 + num2 == 10) {
			return true;
		} else {
			return false;
		}
	}
}
