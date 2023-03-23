package _04OOP;

public class Square{
	Square(double inputSide, String inputColor){          //constructor
		side = inputSide;
		color = inputColor;
	}
	
	private String color;
	private double side;
	
	public void setSide(double newSide) {
		side = newSide;
		
	}
	public double getSide() {
		return this.side;
		
	}
	public void setColor(String newColor) {
		color = newColor;
		
	}
	public String getColor() {
		return this.color;
		
	}
	public double getArea(){
		return side*2;
	}
}