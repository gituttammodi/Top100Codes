package myPackage;

import java.util.Scanner;

public class AsciifromCharacter {
	public static void main(String args[])
	{System.out.println("Enter the String ");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		char c[]=a.toCharArray();
		for (int i = 0; i < c.length; i++) {
			int res=c[i];
			System.out.println(c[i]+"-->"+res);
			
		}
	}

}
