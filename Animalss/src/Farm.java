
public class Farm {

	public static void main(String[] args) {
		
		Cat felix = new Cat(1.5,1.0,"Orange");
		Animal muppet = new Animal(1,3);
		Animal fido = new Dog (3,2,true);
		Horse esroh = new Horse (5,4,10);
		
		System.out.println(felix);
		System.out.println(muppet);
		System.out.println(fido);
		System.out.println(esroh);
		
		System.out.println(felix.makeNoise());
		System.out.println(fido.makeNoise());
		System.out.println(esroh.makeNoise());
		
	}

}
