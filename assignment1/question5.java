import java.util.Scanner;

class question5{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Input an integer between 0 and 10000: ");
		int n=sc.nextInt();		
		int m=n;
		int v=1;
		
		while(m!=0){
			v=v*(m%10);
			m=m/10;
		}
		
		System.out.println("The multiplication of all digits in "+n+" is "+v);


	} 
}