package vehicleActivity;

class Glider extends AirVehicle{
	int wingSpan;

	public Glider() {
		this.wingSpan = (int) Math.floor(Math.random() * 30) + 2;
	}
	
	public String toString() {
		return "This is a Ballon! - color: " + this.color + " - weight: " + this.weigth + "kg - maximum Weigth: " + this.maxWeight + "kg - minimum Weight: " + this.minWeight + "kg - fuel type: " + this.fuelType +  
				" - maximum Altitude: "+ this.maxAltitude + " - wing span: " + this.wingSpan + "m";
	}
	
	public int getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}
	
}