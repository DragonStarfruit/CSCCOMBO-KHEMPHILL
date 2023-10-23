
public class Driver {

	public static void main(String[] args) {
		//Car myCar = new Car();
		Car yourCar = new Car("red", 42, 22.0, 4);
		
		yourCar.setWheel(15, "Alloy");
		
		
		//System.out.println(yourCar.getColor() + " " + yourCar.getMileage() + " " + yourCar.getAmtOfGas());
		System.out.println(yourCar.getColor());
		System.out.println(yourCar.getAmtOfGas());
		yourCar.setColor("green");
		yourCar.setAmtofGas(30.0);
		System.out.println(yourCar.getColor());
		System.out.println(yourCar.getAmtOfGas());
		
		System.out.println(yourCar);
		yourCar.drive(49);
		System.out.println(yourCar);
	}

}
