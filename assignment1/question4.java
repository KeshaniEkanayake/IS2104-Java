import java.util.Scanner;

class question4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter mass in kg: ");
		float m=sc.nextFloat();		
		
		System.out.println("Enter speed in ms^-1: ");
		float v=sc.nextFloat();
		
		float kineticEnergy=(float)0.5*m*v*v;
		System.out.println("kinetic Energy of the object: "+kineticEnergy);
		
		int ke=(int)kineticEnergy;
		System.out.println("Kinetic energy to the nearest integer: "+ke);
		

	} 
}