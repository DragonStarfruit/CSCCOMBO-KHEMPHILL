/************************************
 * 		Temp Converter w/ Methods	*
 ***********************************/

import java.util.Scanner;
import java.util.*;
public class tempConverterMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fTemp;
		  
		Scanner input = new Scanner(System.in);
		System.out.println("Temperature in Fahrenhit?");
		fTemp = input.nextDouble();
		
		double cTemp = (fTemp - 32) * 5/9; 
		double kTemp = cTemp + 273.15; 
		System.out.println("Your Temp was: " + fTemp + "\nCelcius: " + cTemp + "\nKelvin: " + kTemp);

	
}
public static void outputTemp (String scale, double fTemp, cTemp, kTemp)
{
	System.out.println("Your Temp was: " + scale + fTemp + "\nCelcius: " + scale + cTemp + "\nKelvin: " + scale + kTemp);
	//calls method to use as a "funtion" to send and/and not to return info
	// esentially creating a "function" for code to run though or a call 
} 


	
}
