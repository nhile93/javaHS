package chapter1;

public class Employee {
	String name, address, email, phone;
	
	public void display() {
		System.out.println("Name: " +name);
		System.out.println("Address" +address);
		System.out.println("Email: " +email);
		System.out.println("Phone: " +phone);
	}
	
	public static void main(String arg[]) {
		Employee e1 = new Manager();
		Manager m1 = (Manager) e1;
		
		Employee e2 = new Employee();
		e2.name = "nv2";
		e2.address = "ttt";
		e2.email = "awf@gmail.com";
		e2.phone = "012148662";
		Manager m2 = (Manager) e2;
		
		Supervisor s1 = new Supervisor();
		s1.display();
		s1.displayArea();
	}
}

class Manager extends Employee{
	String department;
	public void displayDepartment() {
		System.out.println("Department: " +department);
	}
}


class Supervisor extends Employee{
	String are;
	public void displayArea() {
		System.out.println("Area: " +are);
	}
}
