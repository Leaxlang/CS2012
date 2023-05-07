package university;

public class Staff extends Employee {
	String title;

	public Staff(String name, String address, String phonenumber, String email, String office, int salary,
			String datehired, String title) {
		super(name, address, phonenumber, email, office, salary, datehired);
		this.title = title; 
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String toString() {
		return "This is Staff with the name " + this.name;
	}
	
}
