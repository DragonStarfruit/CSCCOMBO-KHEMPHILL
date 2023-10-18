
public class person {
	
	private String name; 
	private int age; 
	private int hightIn;  
	
	// Constructors
	public person(String name, int age, int hightIn) {
		this.name = name;
		this.age = age; 
		this.hightIn = hightIn; 
	}
	
	// Getters 
	public String getName() {
		return name; 
	}
	
	public int getAge() {
		return age; 
	}
	
	public int getHightIn() {
		return hightIn; 
	}
	
	// Setters
	public void setName(String name) {
		this.name = name; 
	}
	
	public void setAge(int age) {
		this.age = age; 
	}
	
	public void setHightIn(int hightIn) {
		this.hightIn = hightIn; 
	}
	
	//to String Method
	@Override
	public String toString() {
		String str = "Name: " + this.name 
				+ ", Age: " + this.age 
				+ ", Hight in inches: " + this.hightIn; 
		return str; 
	}
}
