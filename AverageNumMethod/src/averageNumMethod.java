import java.util.Scanner;

public class averageNumMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1, num2, num3; 
		double avgNum;
		System.out.println("Input first number: ");
		num1 = input.nextInt(); 
		System.out.println("Input second number: ");
		num2 = input.nextInt(); 
		System.out.println("Input third number: ");
		num3 = input.nextInt(); 
		System.out.println(avgNum(num1, num2, num3));
	}
	public static double avgNum(int num1, int num2, int num3) {
		return (num1 + num2 + num3)/3;
	}
}
