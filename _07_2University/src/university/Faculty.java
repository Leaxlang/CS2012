package university;

public class Faculty extends Employee {
	String officehours;
	String rank;
	
	public Faculty(String name, String address, String phonenumber, String email, String office, int salary,
			String datehired, String officehours, String rank) {
		super(name, address, phonenumber, email, office, salary, datehired);
		this.officehours = officehours;
		this.rank = rank;
	}
	public String getOfficehours() {
		return officehours;
	}
	public void setOfficehours(String officehours) {
		this.officehours = officehours;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String toString() {
		return "This is Faculty with the name " + this.name;
	}

}
