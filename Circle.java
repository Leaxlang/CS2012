package _04OOP;

public class Circle{
	Circle(double inputRadius, String inputColor){          //constructor
		radius = inputRadius;
		color = inputColor;
	}
	
	private String color;
	double radius;
	
	public void setRadius(double newRadius) {
		radius = newRadius;
		
	}
	public double getRadius() {
		return this.radius;
		
	}
	public void setColor(String newColor) {
		color = newColor;
		
	}
	public String getColor() {
		return this.color;
		
	}
	public double getArea(){
		return 3.14 * this.radius * this.radius;
	}
}