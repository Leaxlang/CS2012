package vehicleActivity;

class Car extends LandVehicle{
	String bodyType;
	
	public Car() {
		super();
		int randomType = (int) Math.floor(Math.random() * 5);
		String[] types = {"sedan","fastBack", "coupe", "convertable", "hatchBack"};
		this.bodyType = types[randomType];
	}

	public String toString() {
		return "This is a Car! - color: " + this.color + " - weight: " + this.weigth + "kg - maximum Weigth: " + this.maxWeight + "kg - minimum Weight: " + this.minWeight + "kg - fuel type: " + this.fuelType +
				" - wheels: "+ this.numWheels + " - doors: " + this.numDoors + " - body: " + this.bodyType;
	}
	
	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	
}