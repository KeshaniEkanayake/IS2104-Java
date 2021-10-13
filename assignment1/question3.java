import java.util.Scanner;

class question3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n;
		int val;
		
		
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		
		for(int i=1; i<=10; i++){
			val=n*i;
			System.out.println(n+" x "+" = "+val);
		}
		
		

	} 
}