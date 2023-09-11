import java.util.Scanner;

/********************************
*		Temp Converter			*
*********************************/

public class temperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fTemp;
		  
		Scanner input = new Scanner(System.in);
		System.out.println("Temperature in Fahrenhit?");
		fTemp = input.nextDouble();
		
		double cTemp = (fTemp - 32) * 5/9; 
		double kTemp = cTemp + 273.15; 
		System.out.println("Your Temp was: "+fTemp+"\nCelcius: "+cTemp+"\nKelvin: "+kTemp);

	}

}
