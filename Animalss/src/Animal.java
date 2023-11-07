
public class Animal {
	
	private double lenght; 
	private double heigth;
	
	
	public Animal(double lenght, double heigth) {
		super();
		this.lenght = lenght;
		this.heigth = heigth;
	}

	public String makeNoise() {
		return "Blah, Blah, Blah"; 
	}

	@Override
	public String toString() {
		return "Animal";
	} 
	
	
}
