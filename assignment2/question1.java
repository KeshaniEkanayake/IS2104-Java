import java.util.Scanner;

class question1{
	public static void main(String[] args){
		for(int num=1000; num<=1250; num++){
			int digit1=num/1000;
			int digit2=(num%1000)/100;
			int digit3=(num%100)/10;
			int digit4=(num%100)%10;

			float product=digit1*digit2*digit3*digit4;
			float sum=digit1+digit2+digit3+digit4;
			
			if((sum==7 && product==6) && num%5==3){
				System.out.println("Conditions satisfied. The number is: "+num);
			}
		}
	}
} 