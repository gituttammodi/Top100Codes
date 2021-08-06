package myPackage;

import java.util.Scanner;

public class FindQuadrant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the values of X and Y Cordinates:X=");
		int x=sc.nextInt();
		System.out.print(", Y=");
		int y=sc.nextInt();
		
		quadrant(x,y);

	}

	private static void quadrant(int x, int y) {
		if (x>=0 && y >=0) {
			System.out.println("Quadrant I");
			
		} else if(x<0 && y >=0) {
			System.out.println("Quadrant II");

		}
	else if(x<0 && y <0) {
		System.out.println("Quadrant III");

	} else if(x>0 && y <0) {
		System.out.println("Quadrant IV");

	}
		
	}

}
