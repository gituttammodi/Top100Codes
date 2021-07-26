package myPackage;

import java.util.Scanner;

public class Factor_of_a_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int N=sc.nextInt();
		System.out.println("Factors are: ");
		factors(N);
	}

	private static void factors(int n) {
		int num=(int) n;
		for (int i = 1; i <= n; i++) {
			if (num%i ==0) {
				System.out.println(i+", ");
				
			}
					
		
		}
		
	}

}
