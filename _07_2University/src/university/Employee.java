package university;

public class Employee extends Person {
	String office;
	int salary;
	String datehired;
	
	public Employee(String name, String address, String phonenumber, String email,String office, int salary, String datehired) {
		super(name, address, phonenumber, email);
		this.office = office;
		this.salary = salary;
		this.datehired = datehired; 
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDatehired() {
		return datehired;
	}
	public void setDatehired(String datehired) {
		this.datehired = datehired;
	}
	public String toString() {
		return "This is an Employee with the name " + this.name;
	}
	
}
