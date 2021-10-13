//practical 3
import java.util.Scanner;


 class question5{
	public static void main (String[] args){
		
		for(int num=100; num<=250; num++){
			int digit1=num/100;
			int digit2=(num%100)/10;
			int digit3=num%10;
		
			float product=digit1*digit2*digit3;
			float sum=digit1+digit2+digit3;
			
			if(product==48 && sum==13)
			System.out.println("Conditions satisfied.  The number is: "+num);
		}
		
		
		
	}
}