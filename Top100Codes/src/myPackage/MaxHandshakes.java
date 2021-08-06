package myPackage;

import java.util.Scanner;

public class MaxHandshakes {

	public static void main(String[] args) {
		System.out.println("Enter the number of Perons: ");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		hankshakes(N);

	}

	private static void hankshakes(int n) {
		System.out.println("Total Handshakes: "+n*(n-1)/2+" ways");
		
	}

}
