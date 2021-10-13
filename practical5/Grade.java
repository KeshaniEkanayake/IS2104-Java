//practical 5

import java.util.*;

public class Grade{
	public static void main (String[] args){
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter your mark: ");
		int m= sc.nextInt();
		
		char grade = (m < 50 ? 'F' : (m <= 75 ? 'B': 'A'));
		
		System.out.println("Grade: "+ grade);
		
	}
}


