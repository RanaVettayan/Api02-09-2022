package sample;

public class StringType {
	public static void main(String[] args) {
		System.out.println("====Literal String====");
		String s = "Raj King";
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		System.out.println("====Non Literal String====");
		String s1 = new String("Raj king");
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		System.out.println("====Immutable String====");
		String s2 = "Raj";
		String s3 = "King";
		String concat = s2.concat(s3);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(concat);
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(concat));
		System.out.println("====Mutable String====");
		StringBuilder s4 = new StringBuilder("Raj");
		StringBuilder s5 = new StringBuilder("King");
		StringBuilder append = s4.append(s5);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(append);
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
		System.out.println(System.identityHashCode(append));		

	}

}
