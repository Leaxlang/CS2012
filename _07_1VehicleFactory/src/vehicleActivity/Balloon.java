package vehicleActivity;

class Ballon extends AirVehicle{
	String buoyantGas;
	
	public Ballon() {
		super();
		int randomGas = (int) Math.ceil(Math.random() * 3);
		String[] gasTypes = {"hot-air", "helium", "hydrogen"};
		this.buoyantGas = gasTypes[randomGas];
	}

	public String toString() {
		return "This is a Ballon! - color: " + this.color + " - weight: " + this.weigth + "kg - maximum Weigth: " + this.maxWeight + "kg - minimum Weight: " + this.minWeight + "kg - fuel type: " + this.fuelType +  
		" - maximum Altitude: "+ this.maxAltitude + "m - buoyantGas: " + this.buoyantGas;
	}
	
	public String getBuoyantGas() {
		return buoyantGas;
	}

	public void setBuoyantGas(String buoyantGas) {
		this.buoyantGas = buoyantGas;
	}
	
}