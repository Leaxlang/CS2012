package _04OOP;


public class Rectangle{
	Rectangle(double inputWidth, double inputHeight, String inputColor){
		width = inputWidth;
		height = inputHeight;
		color = inputColor;
	}
	
	double width;
	double height;
	private String color;
	
	public void setWidth(double newWidth) {
		width = newWidth;
	}
	public double getWidth() {
		return this.width;
	}	
	
	public void setHeight(double newHeight) {
		height = newHeight;	
	}
	public double getHeight() {
		return this.height;
	}
	
	public void setColor(String newColor) {
		 color = newColor;
	}
	public String getColor() {
		return this.color;
		
	}
	public double getArea() {
		return width * height;
	}
	
}