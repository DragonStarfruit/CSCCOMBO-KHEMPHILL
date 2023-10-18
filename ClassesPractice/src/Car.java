

public class Car {
	
	private String color;
	private int mileage ;
	private double amtOfGas;
	
	private wheel[] wheel; 
	
	//Constructors
	public Car() {
		color = "white";
		mileage = 1000; 
		amtOfGas = 30.0;
	}
	
	public Car(String color, int mileage, double amtOfGas, int numWheel) {
		this.color = color;
		this.mileage = mileage;
		this.amtOfGas = amtOfGas;
		wheel = new wheel[numWheel];
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
	
	public wheel[] getWheel() {
		return wheel;
	}

	//Mutators or Setters 
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setAmtofGas(double amtOfGas) {
		this.amtOfGas = amtOfGas; 
	}
	
	public void setWheel(int radius, String material) {
		for (int i = 0; i<wheel.length; i++) {
			wheel[i] = new wheel(radius, material);
		}
		
	}

	// Methods 
	public void drive(int milesDriven) {
		mileage = mileage +  milesDriven;
		// miles/gallon = 17
		amtOfGas = amtOfGas - milesDriven/17; 
		
	}
	
	// to string
	public String toString() {
		String str = "The Cars Color: " + this.color 
						+ " and the mileage is:" + this.mileage 
						+ " and the gas amount is: " + this.amtOfGas; 
		return str; 
	}
}
