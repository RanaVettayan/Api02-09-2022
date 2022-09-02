package sample;

public class overLoading {
	private int company(int id) {
		return 4444;

	}
	public String company(String name) {
		return "TCS";

	}
	private long company(long amount) {
		return 5677888L;

	}
	public static void main(String[] args) {
		overLoading overLoading = new overLoading();
		int company = overLoading.company(666);
		long company2 = overLoading.company(66666666l);
		String company3 = overLoading.company("ggg");
		System.out.println(company);
		System.out.println(company2);
		System.out.println(company3);
		
		
	}

}
