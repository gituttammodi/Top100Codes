package myPackage;

import java.util.Scanner;

public class Strong_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int N=sc.nextInt();
		strongNumber(N);
		
		

	}

	private static void strongNumber(int n) {
			int num=n;
			int sum=0;
			
			int rem;
			while (num>0) {
				rem=num%10;
				
				sum=sum+fact(rem);
				num=num/10;
				
				
			}
			if (sum==n) {
				
				System.out.println("Strong Number");
			} else {
				System.out.println("Not a Strong Number");

			}
			
		
	}

	private static int fact(int num) {
			if(num==1)
				return 1;
			else
				return num*fact(num-1);
	}

}
