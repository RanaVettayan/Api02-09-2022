package sample;

public class returnType {
	private void empId() {
		System.out.println("345");
	}
	private int anand(int amount) {
		return amount+1000;
	}
	private int bala(int amount) {
		return amount+1000;

	}
	private String raja(int amount) {
		return "next month";

	}
	public static void main(String[] args) {
		returnType returnType= new returnType();
		int anand = returnType.anand(10000);
		int bala = returnType.bala(10000);
		System.out.println(anand+bala);
		String raja = returnType.raja(10000);
		System.out.println(raja);
		returnType.empId();
		
	}

}
