package Looping;

public class Order {
	int a=1;
	private void print() {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(a+" ");
		
			}
			System.out.println();

		}
	}
	private void print2() {
		int a=1;
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
			a++;
		}
		System.out.println();
		}
		
	}
	private void print1(){
		int a=1;
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				if(i>=j)
					System.out.print(" "+a+" ");
				else
					System.out.print(" ");


			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Order order=new Order();
		order.print();
		order.print1();
		order.print2();
		for(int i=1;i<=3;i++) {
			for(int j=i+1;j<=i;j++) {
				System.out.println(j);

			}
		}
		
	}

}