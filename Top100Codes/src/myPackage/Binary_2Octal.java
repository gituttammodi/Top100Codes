package myPackage;

import java.util.Scanner;

public class Binary_2Octal {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Binary numer: ");
			int n=sc.nextInt();
			
			B2O(n);

	}
//1 1 0 1 0 1 0 1 1
	private static void B2O(int n) {
		String str=String.valueOf(n);
		int c=0;
		int counter=0;
		String ans="";
		int num=0;
		for (int i = 0; i < str.length(); i=i+3) {
			int d1=n%10;
			num=num+(d1*1);
			n=n/10;
			
			int d2=n%10;
			num=num+(d2*2);
			n=n/10;
			
			int d3=n%10;
			num=num+(d3*4);
			n=n/10;
			
			ans=ans+num;
			num=0;
			
			
			
			
		}
			int myans=Integer.parseInt(ans);
			int res=0;
			while(myans>0)
			{
				
				int rem=myans%10;
				myans=myans/10;
				res=res*10+rem;
				
				
			}
			
			
			
//			counter++;
//			int d=0;
//			int d1=n%10;
//			d = (int) (d + Math.pow(2, c));
//			n=n/10;
//			c++;
			
			
			
		
		System.out.println("Decimal: "+res);
		
		
		
	}

}
