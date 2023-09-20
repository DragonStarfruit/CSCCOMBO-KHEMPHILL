import java.util.Scanner;

public class strigFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = "y";
		
		String day = "Tuesday"; 
		
		int date = 5; 
		
		String month = "September";
		
		int year = 2023; 
		
		System.out.println(day + " " + month + " " + date + ", " + year);
		// to comment quotes use "/"words"/"
		System.out.print(day + " ");
		System.out.print(date + " ");
		System.out.print(month + " ");
		System.out.print(year + " ");
		
		Scanner input = new Scanner(System.in);  
		
		System.out.println("Do you know how to get input?");
		answer = input.nextLine(); 
		
		System.out.println(answer);
		
	}

}
