package myPackage;

import java.util.Scanner;

public class Perfect_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Please enter the number: ");
		int N=sc.nextInt();
		isPerfect(N);

	}

	private static void isPerfect(int n) {
		int num=n;
		int sum=0;
		for (int i = 1; i <n; i++) {
			if (num%i==0) {
				
				sum=sum+i;				
			}
			
		}
		if (sum==n) {
			System.out.println("Perfect");
		}else {
			System.out.println("Not Perfect");
		}
	
		
	}

}
