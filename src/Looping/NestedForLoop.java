package Looping;

public class NestedForLoop {
	int a=0;
	private void print() {
		for(int i=1;i<=16;i++) {
			for(int j=1;j==1;j++) {
			System.out.print(" "+i+" ");
			a++;	
			}
	
		if(a==4)
		{
		System.out.println();
		a=0;
		}
		}
	}
	 
	public static void main(String[] args) {
		NestedForLoop nestedForLoop=new NestedForLoop();
		nestedForLoop.print();

	}



}
	
