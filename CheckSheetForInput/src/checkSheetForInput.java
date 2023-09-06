import java.util.Scanner;

/***********************************
 * 				Check Sheet For Input
 */
public class checkSheetForInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String word; 
		int intNum;
		float realNum;
		double biggerRealNum;
		char letter; 
		
		//word input 
		System.out.print("Words go here: ");
		
		word = input.nextLine();
		
		System.out.println("Words goes here: " + word);
		
		// intNum input 
		System.out.print("Int goes here: ");
		
		intNum = input.nextInt(); 
		
		System.out.println("Int goes here: " + intNum);
		// floatNum input 
		System.out.print("The Float goes here: ");
		
		realNum = input.nextFloat();
		
		System.out.println("The float goes here: " + realNum);
		
		//biggerRealNum input
		System.out.print("The Double goes here: ");
		
		biggerRealNum = input.nextDouble(); 
		
		System.out.println("The Double goes here: " + biggerRealNum);
		
		System.out.printf("$%.2f" , biggerRealNum);
		
		// letter input 
		System.out.print("The char go here: ");
		
		letter = input.next().charAt(0); 
		
		System.out.println("The char goes here: " + letter);
		
	}

}
