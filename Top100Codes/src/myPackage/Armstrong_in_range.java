package myPackage;

import java.util.Scanner;

public class Armstrong_in_range {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Please enter first number.");
		int a=sc.nextInt();
		System.out.print("Please enter last number.");
		int b=sc.nextInt();
		
		for (int i = a; i <= b; i++) {
			isArm(i);
			
		}


	}

	private static void isArm(int n) {
		// TODO Auto-generated method stub
		int n1=n;
		int rem;
	
		int res=0;
		
		while(n1!=0)
		{
		
		rem = n1%10;
		n1=n1/10;
		res=(int) (res + Math.pow(rem, 3));
		}
		
		if (res==n) {
			System.out.println(n+" is Armstrong");
			
		}
		
		
	}

}
