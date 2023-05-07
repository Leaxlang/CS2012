package university;

public class UniversityMain{
	public static void main(String[] args) {
		System.out.println("PERSON: ");
		Person person1 = new Person("Jane Doe", "123 Street, CA 90032 LA", "(123)456-8910", "thisisanemail@calstatela.edu");
		System.out.println(person1.toString());

		System.out.println("STUDENT: ");
		Student student1 = new Student("Anne Meyer", "123 Street, CA 90032 LA", "(123)456-8910", "thisisanemail@calstatela.edu", "Junior");
		System.out.println(student1.toString());

		System.out.println("EMPLOYEE: ");
		Employee employee1 = new Employee("Bob Brend", "123 Street, CA 90032 LA", "(123)456-8910", "thisisanemail@calstatela.edu", "Housing", 54000,"Yesterday");
		System.out.println(employee1.toString());

		System.out.println("STAFF: ");
		Staff staff1 = new Staff("Nina Chuba", "123 Street, CA 90032 LA", "(123)456-8910", "thisisanemail@calstatela.edu", "Housing", 54000,"Yesterday", "Facility Manager");
		System.out.println(staff1.toString());

		System.out.println("FACULTY: ");
		Faculty faculty1 = new Faculty("Camilla Drew", "123 Street, CA 90032 LA", "(123)456-8910", "thisisanemail@calstatela.edu", "Housing", 54000,"Yesterday", "Mon & Thu: 1-3am", "Department Chair");
		System.out.println(faculty1.toString());
	}
}