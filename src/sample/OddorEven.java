package sample;

import java.util.Scanner;

public class OddorEven {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int nextInt2 = s.nextInt();
		if(nextInt2%2==0) {
			System.out.println("Even Number");
		}
	else
			{
				System.out.println("Odd Nummber");
		}
	}
}
