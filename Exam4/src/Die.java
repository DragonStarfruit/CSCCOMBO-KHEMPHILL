import java.util.Random;

public class Die {
	
	private int numSides;
	private int value;
	
	//constructors 
	public Die() {
		numSides = 6;
		value = 1; 
	}
	
	public Die(int numSides) {
		this.numSides = numSides;
		this.value = 1; 
	}

	//getters and setters
	public int getNumSides() {
		return numSides;
	}

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	//methods
	public int roll(int sides) {
		Random random = new Random();
		int dieRoll = random.nextInt(1,sides);
		value = dieRoll; 
		return value; 
	}

	@Override
	public String toString() {
		return "Die number of sides" + numSides + "\nvalue:" + value;
	} 
	
	// to String
	
}
