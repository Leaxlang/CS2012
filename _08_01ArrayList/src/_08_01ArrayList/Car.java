package _08_01ArrayList;

public class Car{
	String make;
	String model;
	int year;
	String licensePlate;
	
	public Car(String make, String model, int year, String licensePlate){
		this.make = make;
		this.model = model;
		this.year = year;
		this.licensePlate = licensePlate;
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}
	public Integer getYearAsInteger() {
		return Integer.valueOf(year);
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String toString() {
		return this.make + " " + this.model + " " + this.year + " " + this.licensePlate;
	}
}