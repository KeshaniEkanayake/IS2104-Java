//practical 5

import java.util.*;

public class odd_or_even{
	public static void main (String[] args){
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter number of inputs: ");
		int n= sc.nextInt();	
	
		int oddCount=0;
		int evenCount=0;
	
		int numArray[]=new int[n];
	
		//get elements from the user
		for(int i=0; i<numArray.length; i++){
			System.out.println("Enter the input number : ");
		
			numArray[i]=sc.nextInt();
		
		}
		
		for(int i=0; i<numArray.length; i++){
			if(numArray[i]%2==0){
				evenCount=evenCount+1;
			}
			
			else{
				oddCount=oddCount+1;
			}
		}
		
		
		System.out.println("Number of even values= "+evenCount);
		System.out.println("Number of odd values= "+oddCount);
	}
}