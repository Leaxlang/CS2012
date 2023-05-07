package university;

public class Student extends Person {
	String classstatus;

	public Student(String name, String address, String phonenumber, String email, String classstatus) {
		super(name, address, phonenumber, email);
		this.classstatus = classstatus;
		// TODO Auto-generated constructor stub
	}

	public String getClassstatus() {
		return classstatus;
	}
	
	public String toString() {
		return "This is a Student with the name " + this.name;
	}
}
