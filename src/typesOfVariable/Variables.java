package typesOfVariable;

public class Variables {
	private void localVariable(int b) {
		int a=10;
		System.out.println(a+b);
	}
	private int i;
	private void instanceVariable() {
		i=30;
 
	}
	private void instanceVariable1() {
		i=40;
	}
public static int s;
private static void staticVariable() {
	s=50;
	
}
private static void staticVariable1() {
	s=60;
	
}
public static void main(String[] args) {
	Variables variables = new Variables();
	variables.localVariable(20);
System.out.println(variables.i);
variables.instanceVariable();
System.out.println(variables.i);
variables.instanceVariable1();
System.out.println(variables.i);
System.out.println(s);
Variables.staticVariable();
System.out.println(s);
Variables.staticVariable1();
System.out.println(s);

}
}
