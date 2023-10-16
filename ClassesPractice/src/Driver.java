
public class Driver {

	public static void main(String[] args) {
		Car myCar = new Car();
		Car yourCar = new Car("red", 42, 22.0);
		
		System.out.println(yourCar.getColor() + " " + yourCar.getMileage() + " " + yourCar.getAmtOfGas());

	}

}
