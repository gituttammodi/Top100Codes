package myPackage;

import java.util.Scanner;

public class IsArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Please enter the number.");
		int n=sc.nextInt();
		isArm(n);
		
		

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
			
		}else {
			System.out.println(n+" is not Armstrong");
		}
		
		
	}

}
