import java.util.Scanner;

public class question1{
	public static void main (String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Input marks: ");
		int m=sc.nextInt();	
		char grade;
		
		if(m<25)
			grade='F';
		
		else if (m<45)
			grade='E';
			
		else if (m<50)
			grade='D';
			
		else if (m<60)
			grade='C';
			
		else if (m<80)
			grade='B';
			
		else 
			grade='A';
		
		System.out.println("your grade is "+grade);

	}
}
