import java.util.*;

class Mycalc{
	public double n1;
	public double n2;
	
	public void add(double n1, double n2){
		System.out.println("sum= "+(n1+n2));
	}
	
	public void subtract(double n1, double n2){
		System.out.println("subtraction= "+(n1-n2));
	}
	
	public void divide(double n1, double n2){
		System.out.println("division= "+(n1/n2));
	}
	
	public void multiply(double n1, double n2){
		 System.out.println("multiplication= "+(n1*n2));
	}
	
	public static void main(String[] args) {
		Mycalc cal=new Mycalc();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number: ");
		double x= sc.nextDouble();
		
		System.out.println("Enter second number: ");
		double y= sc.nextDouble();
		
		cal.add(x,y);
		cal.subtract(x,y);
		cal.divide(x,y);
		cal.multiply(x,y);
	}
}