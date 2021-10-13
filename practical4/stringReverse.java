import java.util.Scanner;

public class stringReverse{
	public static void main (String[] args){
		Scanner sc= new Scanner(System.in); 
	
		//get the user input
		System.out.print("Enter a sentence or a paragraph: ");  
		String s= sc.nextLine();              
	 
	
	
		char[] reverse=s.toCharArray();
	
	
		for(int i=reverse.length-1; i>=0; i--){
			System.out.print(reverse[i]);
		
		}
	}
}


