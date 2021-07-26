package myPackage;

import java.util.Scanner;

public class Power_of_a_number {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number digit");
		int N=sc.nextInt();
		System.out.println("Enter the power digit");
		int p=sc.nextInt();
		int ans=power(N, p);
		System.out.println("Answer: "+ans);

	}

	private static int power(int n, int p) {
		int mul=1;
		while (p!=0) {
			mul =mul*n;
			p--;
		}
		return mul;
		
		
	}

}
