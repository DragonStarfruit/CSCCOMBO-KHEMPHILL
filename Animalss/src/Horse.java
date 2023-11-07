
public class Horse extends Animal{
	
	private double speed;

	
	public Horse(double lenght, double heigth, double speed) {
		super(lenght, heigth);
		this.speed = speed; 
	}
	
	
	public String makeNoise() {
		return "Neigh Neigh Neigh"; 
	}

	
	@Override
	public String toString() {
		return "Horse";
	} 
	
	
}
