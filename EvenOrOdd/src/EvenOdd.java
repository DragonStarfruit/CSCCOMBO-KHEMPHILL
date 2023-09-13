/************************************
 * 			Even/Odd				*
 ***********************************/
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub1
		
		int countOdd, countEven ;
		double totalAvg, total, num ;
		countOdd = 0;
		countEven = 0;	
		total = 0;
		totalAvg = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		num = input.nextInt();
		
		while (num != 0) {
		if (num%2 == 0) {
			System.out.println("your number is even");
			countEven ++;
			total = total + num;
			}
			else {
			System.out.println("your number is odd");
			countOdd ++;
			total = total + num;
			}
		System.out.println("Enter number: ");
		num = input.nextInt();
		
		}
		totalAvg = total /(countOdd + countEven );
		System.out.println("Odd count: " + countOdd +  " Even count: " + countEven + " Total of all numbers: " + total + " The Average of your numbers: " + totalAvg);
		
		
		
		
	}

}
