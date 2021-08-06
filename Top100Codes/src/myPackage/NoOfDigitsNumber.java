package myPackage;

import java.util.Scanner;

public class NoOfDigitsNumber {

	public static void main(String[] args) {
	System.out.println("Enter the Nunber: ");
	Scanner sc= new Scanner(System.in);
	
	int N=sc.nextInt();
		noDigits(N);

	}

	private static void noDigits(int n) {
		int d=0;
		while (n!=0) {
			int ld=n%10;
			d++;
			n=n/10;
			
			
		}
		System.out.println("Digits: "+d);
		
	}

}
