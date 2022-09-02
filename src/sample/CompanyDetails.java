package sample;

public class CompanyDetails {
	public void company(String name) {
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		
	}
	public static void main(String[] args) {
		CompanyDetails companyDetails=new CompanyDetails();
		companyDetails.company("Raj king");
		
	}

}
