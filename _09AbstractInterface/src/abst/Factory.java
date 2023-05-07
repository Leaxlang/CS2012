package abst;

public class Factory {
	public static void main(String[] args) {
		Car carAbstract = new Car("carAbstract","car_color",5);
		System.out.println("Speed: ");
		carAbstract.speed(); 
		System.out.println("Paint: ");
		carAbstract.paint();
		
		Truck truckAbstract = new Truck("truckAbstract", "truck_color", 10);
		System.out.println("\nSpeed: ");
		truckAbstract.speed(); 
		System.out.println("Paint: ");
		truckAbstract.paint();
		System.out.println("Drive");
		truckAbstract.drive();
	}

}
