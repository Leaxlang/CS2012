package vehicleActivity;

class Truck extends LandVehicle{
	int cargoSize;
	int maxSize;
	int minSize;
	String cargoType;
	
	public Truck(){
		super();
		this.cargoSize = (int) Math.floor(Math.random() * 10);
		this.minSize = (int) Math.floor(Math.random() * 2);
		this.maxSize = minSize + (int) Math.floor(Math.random() * 10);
		
		int randomCargo = (int) Math.floor(Math.random() * 5);
		String[] cargos = {"openBed", "BoxTruck", "Van", "MiniVan", "DumpTruck"};
		this.cargoType = cargos[randomCargo];
	}
	
	public String toString() {
		return "This is a Truck! - color: " + this.color + " - weight: " + this.weigth + "kg - maximum Weigth: " + this.maxWeight + "kg - minimum Weight: " + this.minWeight + "kg - fuel type: " + this.fuelType +
				" - wheels: "+ this.numWheels + " - doors: " + this.numDoors + " - cargo size: " + this.cargoSize + " - maximum size: " + this.maxSize + " - minimum size: " + this.minSize + " - cargo type: " + this.cargoType;
	}
	
	public int getCargoSize() {
		return cargoSize;
	}
	public void setCargoSize(int cargoSize) {
		this.cargoSize = cargoSize;
	}
	public int getMaxSize() {
		return maxSize;
	}
	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}
	public int getMinSize() {
		return minSize;
	}
	public void setMinSize(int minSize) {
		this.minSize = minSize;
	}
	public String getCargoType() {
		return cargoType;
	}
	public void setCargoType(String cargoType) {
		this.cargoType = cargoType;
	}
}