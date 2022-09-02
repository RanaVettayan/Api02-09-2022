package Interface;

public class securityOfficial implements securityApp{
	@Override
	public void securityId(int id) {
		System.out.println("Security Id is:"+ id);
	}
	@Override
	public void securityPassword(String pass) {
		System.out.println("Security Password is:"+ pass);
	}
	public static void main(String[] args) {
		securityOfficial securityofficial = new securityOfficial();
		securityofficial.securityId(675);
		securityofficial.securityPassword("test@23");
	}

}
