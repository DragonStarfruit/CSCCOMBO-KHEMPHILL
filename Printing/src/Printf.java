
public class Printf {

	/*****************************
	 * Printf ex *
	 ***************************/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Four thirds = %.3f", 4.0 / 3.0);
		System.out.printf("printf four thirds = %10.2f%10s", 4.0 / 3.0, " is the awnser");
		String formattedStr = String.format("Grand Total:%,.2f", 1000000.00);
		System.out.println(formattedStr);

		// 1-100 10x10 table
//			
//			for (int i = 0; i < 100; i++) {
//				if (i%10==0) {
//					System.out.println();
//				}
//					System.out.printf("%4s",i+1);
//		}

		// 10X10 times table 
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.printf("%4d", i * j);
				if (j % 10 == 0) {
					System.out.println();
				}

			}
		}

	}

}
