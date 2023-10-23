
public class weapon {
	private String name; 
	private int damage;
	
	public weapon() {
	}

	public weapon(String name, int damage) {
		this.name = name;
		this.damage = damage;
	}
	
	//Getters
	public String getName() {
		return name;
	}

	public int getDamage() {
		return damage;
	}
	
	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	// to string 
	@Override
	public String toString() {
		return "weapon name:" + name 
				+ "\n damage=" + damage;
	} 
	
	
}
