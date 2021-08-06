package myPackage;

public class Permutation {

	public static void main(String[] args) {
		int n=6;
		int r=5;
		permutation(n,r);
		

	}

	private static void permutation(int n, int r) {
		System.out.println("Permutation: "+fact(n)/fact(n-r));
		
		
	}

	private static int fact(int n) {
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
	}

}
