
public class Animal {
	
	private double lenght; 
	private double heigth;
	
	
	public Animal(double lenght, double heigth) {
		super();
		this.lenght = lenght;
		this.heigth = heigth;
	}

	
	
	public double getLenght() {
		return lenght;
	}



	public void setLenght(double lenght) {
		this.lenght = lenght;
	}



	public double getHeigth() {
		return heigth;
	}



	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}


	public boolean equals(Animal animal) {
		if (this.lenght == animal.lenght && this.heigth == animal.heigth) {
			return true;
		}
		else {
			return false; 
		}
	}
	
	public String makeNoise() {
		return "Blah, Blah, Blah"; 
	}
	
	public String makeNoise(String noise) {
		return noise + " " + noise + " " +  noise; 
	}

	@Override
	public String toString() {
		return "Animal";
	} 
	
	
}
