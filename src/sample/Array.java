package sample;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int a[] = new int [3];
		 a[0] = 10;
		 a[1] = 20;
		 a[2] = 30;
		 System.out.println(a[0]);
		 System.out.println(a[1]);
		 System.out.println(a[2]);
		 System.out.println("Using For Loop");
		 for(int i=0;i<=2;i++)
		 {
			 System.out.println(a[i]);
			 
		 }
		 System.out.println("using for and Instance Variable");
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);
		 }
		 int b[][] = new int [2][2];
		 b[0][0] = 100;
		 b[0][1] = 200;
		 b[1][0] = 300;
		 b[1][1] = 400;
		 System.out.println("using Nested for loop");
		 for(int i=0;i<2;i++) {
			 for(int j=0;j<2;j++)
			 {
				 System.out.println(b[i][j]);
			 }
		 }
			 System.out.println("Enhanced For loop or For Each Loop single array");
		  int c[] = new int [3];
		   c[0] = 1000;
		   c[1] = 2000;
		   c[2] = 3000;
		   for(int d:c)
		   {
			   System.out.println(d);
		   }
		  System.out.println("Enhanced For loop or For Each Loop two dimen array");
		  int f[][] = new int [2][2];
		  f[0][0] = 5000;
		  f[0][1] = 6000;
		  f[1][0] = 7000;
		  f[1][1] = 8000;
		  for (int g[]:f)
		  {
			  for (int h:g)
			  {
				  System.out.print(h+" ");
			  }
			  System.out.println();
		  }
				 
		  Scanner g = new Scanner(System.in);
		  String next = g.next();
	}
	

}
