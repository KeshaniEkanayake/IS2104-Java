import java.util.Scanner;

public class calc{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first value:");
		int A=sc.nextInt();
		
		System.out.println("enter second value:");
		int B=sc.nextInt();
		
		int sum=A+B;
		int sub=A-B;
		int m=A*B;
		int div=A/B;
		
		System.out.println("A+B= "+sum);
		System.out.println("A-B= "+sub);
		System.out.println("A*B= "+m);
		System.out.println("A/B= "+div);
	}	
}