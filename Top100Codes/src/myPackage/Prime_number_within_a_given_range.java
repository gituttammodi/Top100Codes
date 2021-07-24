package myPackage;

import java.util.Scanner;

public class Prime_number_within_a_given_range {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a=sc.nextInt();
		System.out.println("Enter last range number: ");
		int b=sc.nextInt();
		int count=a;
		for (int i = 2; i <= b; i++) {
			while(count!=b)
			{
				if(count%i !=0)
					System.out.println("Prime:"+count);
				
				count++;
				
			}
			
			
			
		}
		sc.close();
		
				

	}

}
