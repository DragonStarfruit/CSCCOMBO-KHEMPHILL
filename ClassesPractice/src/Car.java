
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
	
	//Mutators or Setters 
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setAmtofGas(double amtOfGas) {
		this.amtOfGas = amtOfGas; 
	}
	
	// to string
	public String toString() {
		String str = "The Cars Color: " + this.color 
						+ " and the mileage is:" + this.mileage 
						+ " and the gas amount is: " + this.amtOfGas; 
		return str; 
	}
}
