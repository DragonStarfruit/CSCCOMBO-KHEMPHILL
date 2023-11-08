import java.util.ArrayList;
import java.util.List;

public class Farm {

	public static void main(String[] args) {
		
		List<Animal> anim = new ArrayList<>();
		
		Animal[] animals = new Animal[5];
		
		animals[0] = new Cat(1,2,"grey");
		anim.add(new Cat(1,2,"grey"));
		animals[1] = new Cat(2,1,"orange");
		anim.add(new Cat(2,1,"orange"));
		animals[2] = new Horse(6,12,37);
		anim.add( new Horse(6,12,37));
		animals[3] = new Dog(1,2,false);
		anim.add(new Dog(1,2,false));
		animals[4] = new Horse(10,12,41);
		anim.add(new Horse(10,12,41));
			
		
		for (int i = 0; i<animals.length; i++) {
			System.out.println(animals[i].getHeigth());
		}
		
		for (Animal ani : animals) {
			System.out.println(ani.makeNoise());
		}
	
	}

}
