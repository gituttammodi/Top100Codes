package myPackage;
import java.util.Scanner;

public class HCF {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int b =sc.nextInt();
		hcf(a,b);
		sc.close();
	}
	private static void hcf(int a, int b) {
		int n=1;
		if (a != b) {
			while (n !=0) {
				n=a%b;
				if (n !=0) {
					a=b;
					b=n;	
				} 
			}
			System.out.println("hcf: "+b);	
		} else {
			System.out.println("Wrong Input");
		}
	}

}
