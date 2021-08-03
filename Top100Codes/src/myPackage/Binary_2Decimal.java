package myPackage;

import java.util.Scanner;

public class Binary_2Decimal {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int N=sc.nextInt();
		String s=String.valueOf(N);
		int len=s.length();
		toDecimal(N, len);
		
		

		

	}

	private static void toDecimal(int n, int l) {
		int ans=0;
		String s=String.valueOf(n);
		for (int i = l-1; i >=0; i--) {
			char[] c=s.toCharArray();
			if(c[i]=='1')
			{
				ans=(int) (ans+Math.pow(2, l-1-i));
								
			}

//			ans=(int) (ans+Math.pow(2, i));
			
			
			
		}
		System.out.println("Decimal: "+ans);
		
	}

}
// 2nd program code in java
 /*	Scanner sc = new Scanner(System.in);    
		System.out.print("Enter a binary number : ");
		int binary = sc.nextInt();
		//Declaring variable to store decimal number  
		int decimal = 0;
		//Declaring variable to use in power		
		int n = 0;  
		//writing logic for the conversion
		while(binary > 0)
		{
			int temp = binary%10; 
			decimal += temp*Math.pow(2, n);  
			binary = binary/10;  
			n++;  
		}
		System.out.println("Decimal number : "+decimal); 
                //closing scanner class(not compulsory, but good practice)
		sc.close();
  */
