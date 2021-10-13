import java.util.Scanner;

public class rocket/*use as acceleration*/{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter total mass :");
		float mass=sc.nextFloat();
		
		System.out.println("Enter total thrust :");
		float thrust=sc.nextFloat();
		
		float weight;
		float forceUp;
		float acceleration;
		
		weight=mass* (float)9.8;
		forceUp=thrust-weight;
		acceleration=forceUp/mass;
		
		System.out.println("acceleration: "+acceleration+" ms^-2");
	}
}