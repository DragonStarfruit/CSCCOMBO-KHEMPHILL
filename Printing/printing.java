/*****************************
 * 		Printf ex			*
 ***************************/
public class printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Four thirds = %.3f", 4.0/3.0);
		System.out.printf("printf four thirds = %10.2f%10s" 4.0/3.0, " is the awnser");
		String formattedStr = String.format("Grand Total:%,.2f",1000000.00);
		System.out.println(formattedStr);
		
		//
		
		int i;
		
		for (i =0; <= 100; i++, ) {
			if (i%10) {
				System.out.println("/n""%4s"i);
			}
			else {
				System.out.printf("%4s"i);
			}
			
	}

}
