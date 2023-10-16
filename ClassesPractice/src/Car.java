
public class Car {
	
	private String color;
	private int mileage ;
	private double amtOfGas;
	
	//Constructors
	public Car() {
		
	}
	
	public Car(String myColor) {
		color = myColor; 
		
	}
	
	public Car(String myColor, int mileage) {
		color = myColor; 
		this.mileage = mileage;
		
	}
	
	public Car(String myColor, int mileage, double amtOfGas) {
		color = myColor; 
		this.mileage = mileage;
		this.amtOfGas = amtOfGas;
	}
	
	//Accessors or Getters
	public String getColor() {
		return color; 
	}
	
	public int getMileage() {
		return mileage; 
	}
	
	public double getAmtOfGas() {
		return amtOfGas; 
	}
}
