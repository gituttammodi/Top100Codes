package myPackage;

import java.util.Scanner;

public class Binary_2Octal {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the numer: ");
			int n=sc.nextInt();
			
			B2O(n);

	}

	private static void B2O(int n) {
		
		while (n>0) {
			int c=0;
			
			int d1=n%10;
			n=n/10;
			int temp=0;
			
			temp+=d1 * (int) Math.pow(2, 0);
			
			int d2=n%10;
			n=n/10;
			temp+=d2 * (int) Math.pow(2, 0);
			
			int d3=n%10;
			n=n/10;
			temp+=d3 * (int) Math.pow(2, 0);
			int ans=temp;
			System.out.println(ans+"ans "+"n: "+n);
			
		}
		
		
		
	}

}
