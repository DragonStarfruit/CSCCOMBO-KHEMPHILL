
public class rangedWeapon extends weapon{
	private int range;

	//constructor
	public rangedWeapon() {
		super();
	}

	public rangedWeapon(String name, int damage, int range) {
		super(name, damage);
		this.range = range;
	}

	@Override
	public String toString() {
		return "rangedWeapon [range=" + range + ", getName()=" + getName() + ", getDamage()=" + getDamage()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}


}
