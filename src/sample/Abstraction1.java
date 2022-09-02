package sample;

public class Abstraction1 extends Abstraction {
	public String bankName(String name) {
		return "Jana";
		
	}
	@Override
	public int accNo(int accno) {
		return 5555;
	}
	
	public static void main(String[] args) {
		Abstraction1 abstraction1 = new Abstraction1();
		String bankName = abstraction1.bankName("jana");
		int accNo = abstraction1.accNo(555555);
		int empId = abstraction1.empId(555);
		String name = abstraction1.name("name");
		System.out.println(bankName);
		System.out.println(empId);
		System.out.println(accNo);
		System.out.println(name);

	}
	@Override
	public String name(String name) {
		return "Raja";
	}



	
	

}
