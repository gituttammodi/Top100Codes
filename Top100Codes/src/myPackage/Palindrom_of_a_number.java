package myPackage;

import java.util.Scanner;

public class Palindrom_of_a_number {
public static void main(String[] args) {
		
	//scanner class declaration
			Scanner sc = new Scanner(System.in);
			//input from user
			System.out.print("Enter a String : ");				
			String st = sc.next();
			//string function for calculating length of the string
			int len = st.length();
			//string variable to store reversed string 
			String st1 = "";
			for(int i = len-1 ; i > -1 ; i--)
			{
				//string function for getting character at a particular index
				char ch = st.charAt(i);
				st1 = st1+ch;	
			}
			//condition for checking palindrome by using string function
			if(st.equals(st1))
				System.out.print("Palindrome");
			else
				System.out.print("Not Palindrome");
			//closing scanner class(not compulsory, but good practice)
			sc.close();
			
	}

}
