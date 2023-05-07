package _08_04Employees;

public class Tester{
	public static void main(String[] args) {
		Employee emp = new Employee("Hans Peter", 1.0, 1901, "234-234-2342");
		Employee emp2 = new Employee("Hans Peter", 1.0, 1901, "234-234-2342");
		Employee emp3 = new Employee("Miss B.", 100.01, 2021, "654-567-5675");
		Employee emp4 = new Employee("Hans Peter", 1.0, 1901, "234-234-2340");
		emp3.setName("Barbara Nothing");
		System.out.println(emp3.getName());
		emp3.setAnnualSalary(20000);
		System.out.println(emp3.getAnnualSalary());
		emp3.setInsuranceNum("123");
		System.out.println(emp3.getInsuranceNum());
		emp3.setStartYear(2023);
		System.out.println(emp3.getStartYear());
		System.out.println(emp.equals(emp2));
		System.out.println(emp.equals(emp3));
		System.out.println(emp.equals(emp4));
	}
}