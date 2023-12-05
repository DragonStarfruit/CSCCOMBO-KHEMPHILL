import java.util.Scanner;

public class PseudoCode3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pricip;
		int proAvg = 0;
		int total; 
		int avg; 
		int goodCount = 3;
		int count = 0; 
		total = 0; 
 
		
		while (count<3) {
			System.out.println("how much pricip?");
			pricip = input.nextInt();
			total = total + pricip;
			proAvg = total/3;
			count++; 
		}
		
		System.out.println("Avg of paid reports" + proAvg);
		
		while(count<200) {
			System.out.println("How much pricip");
			pricip = input.nextInt();
			if (pricip <= proAvg*1.25 && pricip>=proAvg*0.75) {
				goodCount++;
				total = total + pricip; 
			}
			count++;
		}
		avg = total/goodCount; 
		System.out.println("the cities avg is" + avg);
	}

}
