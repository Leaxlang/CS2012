package vehicleActivity;

class LandVehicle extends Vehicle{
	int numWheels;
	int numDoors;
	
	public LandVehicle() {
		super();
		this.numWheels = (int) Math.floor(Math.random() * 10)+1;
		this.numDoors = (int) Math.floor(Math.random() * 8);
	}
	
	public int getNumWheels() {
		return numWheels;
	}
	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	public int getNumDoors() {
		return numDoors;
	}
	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}
	
}