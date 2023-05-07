package abst;

public class Car extends Vehicle {
	String name;
	String color;
	int weight;

	public Car(String name, String color, int weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
	}

	@Override
	public void speed() {
		int random = (int) (Math.random()*400 + 100);
		int speed = random/this.weight;
		System.out.println(this.name + ": " + speed);
	}

	@Override
	public void paint() {
		String[] colors = {"red", "blue", "green", "yellow", "black"};
		int random = (int) (Math.random() * colors.length);
		System.out.print(this.name + ": old color - " + this.color);
		this.color = colors[random];
		System.out.println(" new color - " + this.color);
	}

}
