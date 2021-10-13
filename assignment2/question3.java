class question3{
	public static void main(String[] args){
		int n=5;
		int m=n;
		int space=0;
		
		/*---------first triangle-------------*/
		for(int i=0; i<n; i++){
			for(int k=0; k<i; k++){
				System.out.print(" ");
			}
			
			for(int j=0; j<m; j++){
				System.out.print("* ");
			}
			
			m--;
			System.out.println();
		}
		
		
		/*---------second triangle-------------*/
		int val=n;
		
		for(int i=1; i<=n; i++){
			for(int space1=1; space1<val; space1++){
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++){
				System.out.print("* ");
			}
			
			val=val-1;
			System.out.println();
		}
		
	}
}