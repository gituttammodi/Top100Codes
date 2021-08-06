package myPackage;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a=sc.nextInt();
		System.out.println("Enter the second number: ");
		int b=sc.nextInt();
		lcm(a,b);
		}

	private static void lcm(int a, int b) {
		int n1=a;
		int n2=b;
		int lcm=1;

		if (n1 != n2) {
			while (lcm !=0) {
				lcm=n1%n2;
				if (lcm !=0) {
					n1=n2;
					n2=lcm;	
				} 
			}
			System.out.println("lcm: "+(a*b)/n2);	
		} else {
			System.out.println("Wrong Input");
		}
	}

}
