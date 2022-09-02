package sample;

public class company {
	public static void main(String[] args) {
		String s = "Raj King";
	int	length = s.length();
	System.out.println(length);
	int indexOf = s.indexOf('a');
	System.out.println(indexOf);
	String upperCase = s.toUpperCase();
	System.out.println(upperCase);
	String lowerCase = s.toLowerCase();
	System.out.println(lowerCase);
	boolean empty = s.isEmpty();
	System.out.println(empty);
	int lastIndexOf = s.lastIndexOf('g');
	System.out.println(lastIndexOf);
	char charAt = s.charAt(5);
	System.out.println(charAt);
	boolean startsWith = s.startsWith("Raj");
	System.out.println(startsWith);
	boolean endsWith = s.endsWith("aj");
	System.out.println(endsWith);
	boolean contains = s.contains("Raj");
	System.out.println(contains);
	String s1="Qaj king";
	boolean equals = s.equals(s1);
	System.out.println(equals);
	boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
	System.out.println(equalsIgnoreCase);
	String concat = s.concat(s1);
	System.out.println(concat);
	String replace = s.replace("a", "r");
	System.out.println(replace);
	String replaceAll = s.replaceAll("Raj", "Ram");
	System.out.println(replaceAll);
	String trim = s.trim();
	System.out.println(trim);
	String substring = s.substring(4);
	System.out.println(substring);
	int compareTo = s.compareTo(s1);
	System.out.println(compareTo);
	
	
	
	}
	


}
