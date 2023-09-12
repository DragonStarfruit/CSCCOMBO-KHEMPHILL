/************************
 * 		Flowchart 2		*
 ************************/


import java.util.Scanner;

public class flowcharts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double creditHour = 580.00;
		double parkingFee = 650.00;
		double activityFee = 250.00; 
		int creds; 
		double total; 
		char ans; 
		total = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many Creds are you taking?");
		creds = input.nextInt();
		
		if ( creds > 12) 
			total = activityFee + ((creds*creditHour) + parkingFee);
			else 
			System.out.println("Do you want the activity fee? (Y/N)");
			ans = input.next().charAt(0);
				if (ans == 'Y' );
				total = activityFee + ((creds*creditHour) + parkingFee);
					else   
					total = (creds*creditHour) + parkingFee; 
					
		System.out.println("Your total is: " + total);
		
		
	}

}
