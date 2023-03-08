package _04OOP;

public class Shape{
	public static void main(String[] args) {
		Circle circle1 = new Circle(2.3, "blue");
		Circle circle2 = new Circle(3.8, "purple");
		
		Square square1 = new Square(4.5,"yellow");
		Square square2 = new Square(7.4,"orange");
		
		Rectangle rect1 = new Rectangle(4.4,3.4,"pink");
		Rectangle rect2 = new Rectangle(2.3,5.6,"fuchsia");
		
		
		System.out.println(circle1.getRadius());
		System.out.println(circle1.getColor());
		System.out.println(circle1.getArea());
		
		System.out.println("--------");
		
		System.out.println(circle2.getRadius());
		System.out.println(circle2.getColor());
		System.out.println(circle2.getArea());
		
		System.out.println("--------");
		
		System.out.println(square1.getSide());
		System.out.println(square1.getColor());
		System.out.println(square1.getArea());
		
		System.out.println("--------");
		
		System.out.println(square2.getSide());
		System.out.println(square2.getColor());
		System.out.println(square2.getArea());
		
		System.out.println("--------");
		
		System.out.println(rect1.getWidth());
		System.out.println(rect1.getHeight());
		System.out.println(rect1.getColor());
		System.out.println(rect1.getArea());
		
		System.out.println("--------");
		
		System.out.println(rect2.getWidth());
		System.out.println(rect2.getHeight());
		System.out.println(rect2.getColor());
		System.out.println(rect2.getArea());
		
		
	}
}