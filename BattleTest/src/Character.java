
public class Character {
	private String name;
	private int strength;
	private double speed; 
	private int health;
	private weapon weapon; 
	
	public Character() {
		super();
	}
	public Character(String name, int strength, int health, double speed, weapon weapon) {
		this.name = name;
		this.strength = strength;
		this.speed = speed;
		this.health = health;
		this.weapon = weapon;
	}
	
	//Getters
	public String getName() {
		return name;
	}
	public int getStrength() {
		return strength;
	}
	public double getSpeed() {
		return speed;
	}
	public int getHealth() {
		return health;	
	}
	public weapon getWeapon() {
		return weapon;
	}	
	
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void setWeapon(weapon weapon) {
		this.weapon = weapon; 
	}
	
	// to String 
	@Override
	public String toString() {
		return "Character name:" + name 
				+ "\nstrength:" + strength 
				+ "\nspeed:" + speed 
				+ "\nhealth:" + health
				+ "\nweapon=" + weapon;
	}


}
