package myPackage;

public class SecondMost {

	public static void main(String[] args) {
		int N[]= {9,8,7,6,5,4,3,2,1,0};
		secondMax(N);
		

	}

	private static void secondMax(int[] n) {
		int min=n[0];
		int min2=n[1];
		int inx=0;
		
		int sum=min;
		
		for (int i = 1, j=1; i < n.length; i++,j++) {
			sum+=sum;
			
			if (min>=n[i]) {
				min=n[i];
				inx=i;
								
			} 
		}
		int minf=n[0];
		for (int i = 1, j=1; i < n.length; i++,j++) {
			
				
					
			if (minf>=n[i] && i!=inx) {
				minf=n[i];
				
				
			
			}
		}
		
		System.out.println(minf);
		
		
		
	}

}
