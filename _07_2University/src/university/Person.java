/**
 * 
 */
package university;	

public class Person {

	String name;
	String address;
	String phonenumber;
	String email;
	
	

public Person(String name, String address, String phonenumber, String email) {
		this.name = name;
		this.address = address;
		this.phonenumber = phonenumber;
		this.email = email;
	}

//Override the toString
//method in each class to display the class name and the person’s name.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "This is a Person with the name " + this.name;
	}
}