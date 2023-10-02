import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.println("how many strings?");
		num = input.nextInt();
		
		int[] letterCount = new int[num];
		String[] str = new String[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("Enter String: ");
			str[i] = input.next();
			letterCount[i] = str[i].length();
		}

		// String Check
			for (int i = 0; i < num; i++) {
				System.out.println(str[i]);
				System.out.println(letterCount[i]);
			}
	}
}
