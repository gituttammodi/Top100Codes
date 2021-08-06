package myPackage;

import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter any character value: ");
		String c=sc.next();
		char ch[]=c.toCharArray();
		char cha=ch[0];
		if (cha == 'A' || cha=='a'||
				cha == 'E' || cha=='e' ||
				cha == 'I' || cha=='i' ||
				cha == 'O' || cha=='o' ||
				cha == 'U' || cha=='u'
				) {
			System.out.println(cha+" is Vowel");
			
		} else {
			System.out.println(cha+" is Consonent");

		}
		

	}

}
