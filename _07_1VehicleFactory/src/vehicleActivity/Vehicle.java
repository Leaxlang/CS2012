package vehicleActivity;

class Vehicle{
	String color;
	int weigth;
	int maxWeight;
	int minWeight;
	String fuelType;
	
	public Vehicle() {
		super();
		int randomColor = (int) Math.floor(Math.random() * 8);
		String[] colors = {"red", "purple", "blue","pink", "fuchsia","orange","black","yellow"};
		this.color = colors[randomColor];
		
		this.weigth = (int) Math.floor(Math.random() * 800) + 100;
		
		this.minWeight = (int) Math.floor(Math.random() * 800) + 100;
		this.maxWeight = minWeight + (int) Math.floor(Math.random() * 70) + 100;
		
		int randomFuel = (int) Math.floor(Math.random() * 6);
		String[] fuels = {"animal-powered", "gas", "electric", "diesel", "kerosene", "methane"};
		this.fuelType = fuels[randomFuel];
	}
	
	public String toString() {
		return "This is a vehicle! It's " + this.color + " ,weighs " + this.weigth + "kg with a minimum weight of " + 
							this.minWeight + "kg and a maximum weight of " + this.maxWeight+" kg. It uses " + this.fuelType + " as fuel.";
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeigth() {
		return weigth;
	}
	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}
	public int getMaxWeight() {
		return maxWeight;
	}
	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	public int getMinWeight() {
		return minWeight;
	}
	public void setMinWeight(int minWeight) {
		this.minWeight = minWeight;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
}