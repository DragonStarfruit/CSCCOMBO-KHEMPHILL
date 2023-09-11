/********************************
 * 			Flowchart 1			*
 ********************************/


import java.util.Scanner;

public class flowchart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double creditHour = 580.00;
		double parkingFee = 650.00; 
		int creds; 
		double total; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many Creds are you taking?");
		creds = input.nextInt();
		
		total = (creds*creditHour) + parkingFee;
		System.out.println("Your total is: " + total);
		
	}

}
