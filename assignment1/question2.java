import java.util.Scanner;

class question2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		
		
		System.out.println("Enter first number: ");
		a=sc.nextInt();
		
		System.out.println("Enter second number: ");
		b=sc.nextInt();
		
		int product=a*b;
		System.out.println("Product of given 2 values: "+product);

	} 
}