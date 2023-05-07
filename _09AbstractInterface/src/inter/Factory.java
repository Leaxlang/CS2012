package inter;

public class Factory {
	public static void main(String[] args) {
		Car carInterface = new Car("carInter", "carColor", 5);
		System.out.println("Speed: ");
		carInterface.speed();
		System.out.println("Paint: ");
		carInterface.paint();
		Truck truckInterface = new Truck("TruckInter", "TruckColor", 10);
		System.out.println("\nSpeed: ");
		truckInterface.speed();
		System.out.println("Paint: ");
		truckInterface.paint();
	}
}
