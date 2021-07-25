package myPackage;

import java.util.Scanner;

public class Factorial_of_a_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer Number, ");
		int N=sc.nextInt();
		
	
		int ans=factorial(N);
		System.out.println("factorial is: "+ans);

	}

	private static int factorial(int n) {

			if(n==1)
				return 1;
			else 
				return n*factorial(n-1);
		
	}

}
