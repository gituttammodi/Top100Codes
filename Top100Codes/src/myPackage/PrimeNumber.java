package myPackage;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		
		if (n==2 || n==3) 
			System.out.println("prime.");
		else {
	
		for (int j = 2; j < n; j++) {
			if (n%j == 0 ) {
				System.out.println("Not prime.");
				break;
				
			}
			else {
				System.out.println("prime.");
				break;
				
			}
		}
		}
		sc.close();
		
		
	}

}
