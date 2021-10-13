import java.util.Scanner;

class question1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		float pi=(float)3.1415926535;
		
		System.out.println("Enter radius: ");
		float r=sc.nextFloat();
		
		float perimeter=2*pi*r;
		System.out.println("Perimeter: "+perimeter);

	} 
}