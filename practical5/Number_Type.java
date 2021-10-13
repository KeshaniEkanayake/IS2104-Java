//practical 5

import java.util.*;

public class Number_Type{
	public static void main (String[] args){
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter your number: ");
		int n= sc.nextInt();
		
		if(n%25==0 && n%100!=0 && n%4==0 && n%128!=0){
			System.out.println("Type A and Type B");
		}	
		else{
			if(n%25==0 && n%100!=0){
				System.out.println("Type A");
			}
			else{
				if(n%4==0 && n%128!=0){
					System.out.println("Type B");
				}
				else{
					System.out.println("not Type A and Type B");
				}
			}
		}
		
		
	}
	
}