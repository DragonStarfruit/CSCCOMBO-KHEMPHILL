import java.util.Scanner;

public class smallestNumberMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1, num2, num3; 
		System.out.println("Input first number: ");
		num1 = input.nextInt(); 
		System.out.println("Input second number: ");
		num2 = input.nextInt(); 
		System.out.println("Input third number: ");
		num3 = input.nextInt(); 
		System.out.println(smallestNumber(num1, num2, num3));
	}

	public static int smallestNumber(int num1, int num2, int num3) {
		// TODO change whiles to ifs
		while (num1 < num2) {
			while (num1 < num3) {
				return num1;
			}
		}
		while (num2 < num3) {
			while (num2 < num1) {
				return num2;
			}
		}
		while (num3 < num2) {
			while (num3 < num1) {
				return num3;
			}
		}
		return -1;
	}
}
