package myPackage;

import java.util.Scanner;

public class Reverse_of_a_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digits:");
		int n = sc.nextInt();
		int sum=0;
		int res=0;
			while(n!=0)
			{	
				
				int rem = n%10;
				n=n/10;
				res=res * 10 +rem;
				sum=sum+rem;
				
				
			}
			System.out.println("Reverse of the number:"+res);
	}


}
