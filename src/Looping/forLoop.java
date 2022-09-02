package Looping;

public class forLoop{
	private void name(String name) {
		for(int i=1;i<11;i++) {
			System.out.println("My Name is:"+name);
		}

	}
	private void oddNumber() {
		for(int i=99;i>0;i=i-2)
		{
			System.out.println(i);
		}

	}
	private void evenNumber() {
		for(int i=100;i>0;i=i-2) 
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		forLoop forloop = new forLoop();
		forloop.name("Raj");
		forloop.oddNumber();
		forloop.evenNumber();
	}

}
