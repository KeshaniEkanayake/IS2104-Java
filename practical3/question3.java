import java.util.Scanner;

public class question3{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
	
		float answer=0;
		
		System.out.println("Input first number: ");
		float x=sc.nextFloat();	
		
		System.out.println("Input second number: ");
		float y=sc.nextFloat();	
		
		System.out.println("Enter an operator (+,-,*,/): ");
		char operator=sc.next().charAt(0);  //input a character

		switch(operator){
				case '+':
					System.out.println(x+" "+operator+" "+y+" = "+(x+y));

					break;
				case '-':
					System.out.println(x+" "+operator+" "+y+" = "+(x-y));

					break;
				case '*':
					System.out.println(x+" "+operator+" "+y+" = "+(x*y));

					break;
				case '/':
					System.out.println(x+" "+operator+" "+y+" = "+(x/y));
					break;
				default:
					System.out.println("Incorrect operator.");
					break;
		}
		
		
	}
	
	
	}