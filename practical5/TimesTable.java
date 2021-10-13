//practical 5

import java.util.*;

public class TimesTable{
	public static void main (String[] args){
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter number (1 to 10 inclusive): ");
		int n= sc.nextInt();
		
		for(int i=1; i<=10; ++i){
			System.out.println(n+" x "+i+" = "+ n*i);
		}
	}
}	