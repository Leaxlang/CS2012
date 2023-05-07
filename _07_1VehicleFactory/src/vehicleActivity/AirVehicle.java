package vehicleActivity;

class AirVehicle extends Vehicle{
	int maxAltitude;
	
	public AirVehicle() {
		super();
		this.maxAltitude = (int) Math.floor(Math.random() * 10000) + 100;
	}

	public int getMaxAltitude() {
		return maxAltitude;
	}

	public void setMaxAltitude(int maxAltitude) {
		this.maxAltitude = maxAltitude;
	}
}