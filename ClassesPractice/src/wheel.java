
public class wheel {
	
	private int radius; 
	private String material; 
	
	// constructors 
	public wheel(int radius, String material) {
		this.radius = radius;
		this.material = material;
	}

	// getters 
	public int getRadius() {
		return radius;
	}

	public String getMaterial() {
		return material;
	}

	// to string 
	@Override
	public String toString() {
		return "wheel radius: " + radius + ", material: " + material; 
	}
	
	
}
