
public class Cat extends Animal{
	
	private String color;

	
	public Cat(double lenght, double heigth, String color) {
		super(lenght, heigth);
		this.color = color;
	}
	
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


//	public boolean equals(Animal cat) {
//		if (this.getLenght() == cat.getLenght() && this.getHeigth() == cat.getHeigth() && this.color.equals(cat.color)) {
//			return true;
//		}
//		else {
//			return false; 
//		}
//	}
	
	public String makeNoise() {
		return "Meow  Meow Meow"; 
	}
	
	
	@Override
	public String toString() {
		return "Cat";
	} 
	
}
