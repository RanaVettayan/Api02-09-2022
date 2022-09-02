package sample;

public class Employee extends Emp {
	public Employee() {
		super(200);
		System.out.println("Default Constructor");
		
	}
	public  Employee(int id) {
		this("java");
		System.out.println("Parameterized Constructor");
	}
	public  Employee(String Name) {
		this();
		System.out.println("Another One");
	}
	public static void main(String[] args) {
		Employee employee = new Employee(200);
	}
}
