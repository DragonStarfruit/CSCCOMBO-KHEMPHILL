
public class Dog extends Animal{
	
	private boolean drool; 
	
	
	public Dog(double lenght, double heigth, boolean drool) {
		super(lenght, heigth);
		this.drool = drool; 
	}
	
	
	public String makeNoise() {
		return "Woof Woof Woof"; 
	}
	
	
	@Override
	public String toString() {
		return "Dog";
	}

	
	
}
