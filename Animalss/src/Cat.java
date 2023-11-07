
public class Cat extends Animal{
	
	private String color;

	
	public Cat(double lenght, double heigth, String color) {
		super(lenght, heigth);
		this.color = color;
	}
	
	
	public String makeNoise() {
		return "Meow  Meow Meow"; 
	}
	
	
	@Override
	public String toString() {
		return "Cat";
	} 
	
}
